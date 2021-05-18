class Solution {
    public int[] decompressRLElist(int[] nums) {
        int k=0,res=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            res=res+nums[i];
        }
        int[] z=new int[res];
        for(int i=0;i<nums.length;i=i+2)
        {
            for(int j=0;j<nums[i];j++)
            {
                z[k++]=nums[i+1];
            }
        }
        return z;
    }
}
