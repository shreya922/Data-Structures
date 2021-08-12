class Solution {
    //checking cycle in a direct graph using bfs
    //if there is a cycle then not possiblenecoz topological sort if for directted,acyclic graph
    public boolean canFinish(int numCourses, int[][] prerequisites) {
          ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
   boolean[] visited=new boolean[numCourses];
          boolean[] dfsvisited=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
           int u=prerequisites[i][0];
            int v=prerequisites[i][1];
                    list.get(u).add(v);
            
        }
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
        if(checkcycle(list,visited,dfsvisited,i))
        {
            return false;
        }
            }
            }
        return true;
    }
    public boolean checkcycle(ArrayList<ArrayList<Integer>> list, boolean[] visited,boolean[] dfsvisited,int s)
    {
       visited[s]=true;
        dfsvisited[s]=true;
        for(int neib:list.get(s))
        {
            if(!visited[neib])
            {
                if(checkcycle(list,visited,dfsvisited,neib))
                    return true;
            }
            else if(dfsvisited[neib]==true)
                return true;
        }
        dfsvisited[s]=false;
        return false;
    }
}
