class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] z=new int[2];
        z[0]=-1;
        z[1]=-1;
        int k=0;
        if(nums.length==1)
        {
            if(nums[0]==target)
                z[0]=z[1]=0;
            return z;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(k==0)
                {
                z[0]=z[1]=i;
                    k++;
                }
                else
                    z[1]=i;
            }
        }
        return z;
    }
}
