class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<Integer>();
        int[] nextgreater=new int[nums.length];
          int[] prevgreater=new int[nums.length];
        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
        for(int i=0;i<nums.length;i++)
        {
           nextgreater[i]=Integer.MIN_VALUE; 
        }
        for(int i=0;i<nums.length;i++)
        {
           prevgreater[i]=Integer.MIN_VALUE; 
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
            for(int j=0;j<i;j++)
            {
                if(nums[j]>nums[i])
                {
                   prevgreater[i]=nums[j]; 
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nextgreater[i]==Integer.MIN_VALUE&&prevgreater[i]!=Integer.MIN_VALUE)
              nextgreater[i]= prevgreater[i]; 
            else if(nextgreater[i]==Integer.MIN_VALUE&&prevgreater[i]==Integer.MIN_VALUE)
                nextgreater[i]=-1; 
            
        }
        return nextgreater;
    }
}
