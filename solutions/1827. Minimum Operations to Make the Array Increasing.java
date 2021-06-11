class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st=new Stack<Integer>();
        int i=0,x=0;
        for(i=0;i<nums.length;i++)
        {
            if(!st.isEmpty()&&nums[i]<=st.peek())
            {
                 x=x+st.peek()-nums[i]+1;
                 
            }
            if(!st.isEmpty()&&nums[i]<=st.peek())
            st.push(st.peek()+1);
            else
                st.push(nums[i]);
        }
        return x;
    }
}
