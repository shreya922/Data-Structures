class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<Integer>();
        int[] nextgreater=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           nextgreater[i]=Integer.MIN_VALUE; 
        }
        for(int i=0;i<nums.length;i++)
        {
            while(!st.isEmpty()&&nums[st.peek()]<nums[i])   
                 {
                     int a=st.pop();
                     nextgreater[a]=nums[i];
                 }
                    st.push(i);  
        }
        st.clear();
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nextgreater[i]==Integer.MIN_VALUE)
            {
            for(int j=0;j<i;j++)
            {
                if(nums[j]>nums[i])
                {
                   nextgreater[i]=nums[j]; 
                    break;
                }
            }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nextgreater[i]==Integer.MIN_VALUE)
              nextgreater[i]= -1; 
            
        }
        return nextgreater;
    }
}
