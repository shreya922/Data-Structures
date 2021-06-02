class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
 for(int i=0;i<nums2.length;i++)
 {
    
     map.put(nums2[i],i);
     
 }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int key=map.get(nums1[i]);
            int j=0;
            for(j=key+1;j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i])
                {
                    ans[i]=nums2[j];
                    break;
                }
            }
            if(j==nums2.length)
                ans[i]=-1;
        }
        return ans;
    }
}
