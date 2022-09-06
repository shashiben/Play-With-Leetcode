class Solution {
    public int numIslands(char[][] grid) {
        int n=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    n+=bfs(grid,i,j);
                }  
            }
        }
        return n;
        
    }
    int bfs(char[][] grid,int i,int j){
        if(i<0 || j<0 ||i>=grid.length ||j>=grid[0].length || grid[i][j]!='1'){
            return 0;
        }
        grid[i][j]=0;
        bfs(grid,i-1,j);
        bfs(grid,i+1,j);
        bfs(grid,i,j-1);
        bfs(grid,i,j+1);
        return 1;
    }
}