class Solution {
    public int[] dailyTemperatures(int[] a) {
        int[] ans=new int[a.length];
       Stack<Integer> st=new Stack<Integer>();
        st.push(0);
        for(int i=1;i<a.length;i++)
        {
            if(a[st.peek()]>a[i])
                st.push(i);
            else
            {
                while(!st.isEmpty()&&a[st.peek()]<a[i])
                {
                    int a1=st.pop();
                    ans[a1]=i-a1;
                }
                st.push(i);
            }
        }
        return ans;
        
    }
}
