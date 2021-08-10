class Solution {
      boolean[] visited;
    int count=0;
         ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
    public int findCircleNum(int[][] isConnected) {
   visited=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected[i].length;j++)
            {
                if(isConnected[i][j]==1&&i!=j)
                    list.get(i).add(j);
            }
        }
        for(int i=0;i<isConnected.length;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(i);
            }
        }
        return count;
    }
    public void dfs(int s)
    {
        visited[s]=true;
