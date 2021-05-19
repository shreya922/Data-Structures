class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int x=1;
        int f=0;
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
                f++;
        }
        List<Integer> temp=new ArrayList<Integer>();
        f=0;
        while(x<=nums.length)
        {
          if(!set.contains(x))
              temp.add(x);
            x++;
          }
             return temp; 
        
    }
}
