class Solution {
    public int findDuplicate(int[] nums) {
        int i=0,j=0;
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        for(i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
                return nums[i];
        }
        return -1;
    }
}
