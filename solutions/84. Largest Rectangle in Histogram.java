class Solution {
    public int largestRectangleArea(int[] h) {
        int max=Integer.MIN_VALUE;
     int[] prev=new int[h.length];
        int[] next=new int[h.length];
        Stack<Integer>st=new Stack<Integer>();
        for(int i=0;i<h.length;i++)
        {
            prev[i]=i;
            next[i]=h.length-i-1;
        }
        for(int i=0;i<h.length;i++)
        {
            while(!st.isEmpty()&&h[st.peek()]>h[i])
            {
                next[st.peek()]=i-st.peek()-1;
                st.pop();
            }
            st.push(i);
        }
        st.clear();
        for(int i=h.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&h[st.peek()]>=h[i])
            {
                prev[st.peek()]=st.peek()-i-1;
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<h.length;i++)
        {
            int count=next[i]+prev[i]+1;
            count=count*h[i];
            if(count>max)
                max=count;
        }
