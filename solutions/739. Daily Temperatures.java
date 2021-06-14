class Solution {
    public int[] dailyTemperatures(int[] a) {
        int[] ans=new int[a.length];
       Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<a.length;i++)
        {
                while(!st.isEmpty()&&a[st.peek()]<a[i])
                {
                    int a1=st.pop();
                    ans[a1]=i-a1;
                }
                st.push(i);
        }
        return ans;
        
    }
}
