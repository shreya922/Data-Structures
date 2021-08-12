class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
          ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
       
   boolean[] visited=new boolean[graph.length];
          boolean[] dfsvisited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
                ArrayList<Integer> templist=new  ArrayList<Integer>();
            for(int j=0;j<graph[i].length;j++)
            {
            templist.add(graph[i][j]);
            }
            
            list.add(templist);
        }
        System.out.print(list);
        ArrayList<Integer> list1=new  ArrayList<Integer>();
        for(int i=0;i<graph.length;i++)
        {
          // Arrays.fill(visited,false);
        if(checkcycle(list,visited,dfsvisited,i)==false)
        {
          list1.add(i);  
        }
            }
        
        return list1;
        
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
