class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] visited=new int[isConnected.length];
        int result=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                dfs(isConnected,visited,i);
                result++;
            }
        }
        return result;
    }
    public static void dfs(int[][] isConnected,int[] visited,int index){
        if(visited[index]==1){
            return;
        }else{
            visited[index]=1;
            for(int i=0;i<isConnected[index].length;i++){
                if(visited[i]==0 && isConnected[index][i]==1){
                    dfs(isConnected,visited,i);
                }
            }
        }
    }

    
}