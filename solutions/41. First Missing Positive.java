import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int firstMissingPositive(int[] nums) {
      Arrays.sort(nums);
        
       
        int x=1;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            if(nums[i]>0&&nums[i]!=x)
            {
                return x;
            } 
           if(nums[i]>0&&nums[i]==x){
               x++;
           }
        }
        return x;
    
    }
}
