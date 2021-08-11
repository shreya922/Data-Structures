class Solution {
    public int findJudge(int n, int[][] trust) {
         ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++)
            list.add(new ArrayList<>());
        for(int i=0;i<trust.length;i++)
        {
            list.get(trust[i][0]).add(trust[i][1]);
        }
        System.out.print(list);
          int ans=-1;
         for(int i=1;i<list.size();i++)
        {
            if(list.get(i).size()==0)
            {
              ans=i;  
            }
         }
      System.out.print(ans);
        boolean flag=false;
        for(int i=1;i<list.size();i++)
        {
            
            if(!list.get(i).contains(ans)&&i!=ans)
                return -1;
        }
        return ans;
    }
}
