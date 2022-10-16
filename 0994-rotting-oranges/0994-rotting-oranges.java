class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) freshCount++;
                else if (grid[i][j] == 2) q.offer(new int[]{i,j});
            }
        }
        int minutes = 0;
        while (freshCount > 0 && !q.isEmpty()) {
            minutes++;
            int size = q.size();
            while (freshCount > 0 && size > 0) {
                int[] pair = q.poll();
                int i = pair[0];
                int j = pair[1];
                if (check(grid, i + 1, j, q)) freshCount--;
                if (check(grid, i - 1, j, q)) freshCount--;
                if (check(grid, i, j + 1, q)) freshCount--;
                if (check(grid, i, j - 1, q)) freshCount--;
                size--;
            }
        }
        return freshCount == 0 ? minutes : -1;
    }
    boolean check(int[][] grid, int i, int j, Queue<int[]> q) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || m <= i || j < 0 || j >= n || grid[i][j] != 1) return false;
        grid[i][j] = 2;
        q.offer(new int[]{i,j});
        return true;
    }
}