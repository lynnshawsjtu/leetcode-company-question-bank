class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //构造graph
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;++i){
            graph.add(new ArrayList<>());
        }

        //构建edges
        for(int i=0;i<prerequisites.length;++i){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        //找环
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;++i){
            if(findCircle(i,visited,graph))return false;
        }
        return true;
    }
    //dfs找环
    private boolean findCircle(int node,int[] visited,List<List<Integer>> graph){
        if(visited[node]==1) return true;
        if(visited[node]==2) return false;
        visited[node]=1;
        for(Integer pre:graph.get(node)){
            if(findCircle(pre,visited,graph)) return true;
        }
        visited[node]=2;
        return false;
    }
}
