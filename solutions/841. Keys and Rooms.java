class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        visited=dfs(rooms,visited,0);
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
                return false;
        }
        return true;
    }
    public boolean[] dfs(List<List<Integer>> rooms,boolean[] visited,int start)
    {
        visited[start]=true;
      for(int neib:rooms.get(start))
      {
          if(visited[neib]==false)
         dfs(rooms,visited,neib); 
      }
        return visited;
    }
}
