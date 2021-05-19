import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int firstMissingPositive(int[] nums) {
      Arrays.sort(nums);
        int x=1;
        Boolean flag=true;
        while(flag)
        {
            int i=0;
        for( i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                x++;
                break;
            }
        }
            if(i==nums.length)
            {
                flag=false;
                return x;
            }
        
        }
        return -1;
    }
}
