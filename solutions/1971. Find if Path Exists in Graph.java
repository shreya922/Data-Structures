class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
         ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
       for(int i=0;i<n;i++)
           list.add(new ArrayList<>());
   boolean[] visited=new boolean[n];
        for(int i=0;i<edges.length;i++)
        {
           int u= edges[i][0];
            int v= edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        visited=dfs(list,visited,start);
        if(visited[end]==true)
            return true;
        return false;
    }
    public boolean[] dfs(ArrayList<ArrayList<Integer>> list,boolean[] visited,int start)
    {
       visited[start]=true;
        for(int neib:list.get(start))
        {
            if(!visited[neib])
                dfs(list,visited,neib);
                
        }
        return visited;
     }
}
