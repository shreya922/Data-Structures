class Solution {
    //check cycle in directed graph is present then not possible else return topological sort as answer
    Stack<Integer> st=new Stack<Integer>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
            int[] temp=new int[0];
            return temp;
        }
            }
        }
        int[] ans=new int[st.size()];
        int k=st.size()-1;
        while(!st.isEmpty())
        {
            ans[k--]=st.pop();
        }
        return ans;
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
        st.push(s);
        dfsvisited[s]=false;
        return false;
    }
}
