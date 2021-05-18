class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int diff=0;
        int curr=0;
        for(int i=0;i<nums.length-1;i++)
        {
           curr=nums[i+1]-nums[i];
            if(curr>diff)
                diff=curr;
        }
        return diff;
    }
}
