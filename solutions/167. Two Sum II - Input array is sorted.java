class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>target)
                break;
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                    {
                    ans[0]=i+1;
                    ans[1]=j+1;
                    break;
                }
                else if(numbers[i]+numbers[j]>target)
                    break;
            }
        }
        return ans;
    }
    
  
}
