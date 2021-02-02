class Solution {
    public int findCircleNum(int[][] isConnected) {
        //dfs
        boolean[] visited=new boolean[isConnected.length];
        int ret=0;
        for(int i=0;i<isConnected.length;++i){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                ret++;
            }
        }
        return ret;
    }

    private void dfs(int[][] m,boolean[] visited,int i){
        for(int j=0;j<m.length;++j){
            if(m[i][j]==1&&!visited[j]){
                visited[j]=true;
                dfs(m,visited,j);
            }
        }
    }
}
