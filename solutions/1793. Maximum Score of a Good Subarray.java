class Solution {
    public int maximumScore(int[] h, int k) {
                int max=Integer.MIN_VALUE;
     int[] prev=new int[h.length];
        int[] next=new int[h.length];
        Stack<Integer>st=new Stack<Integer>();
        for(int i=0;i<h.length;i++)
        {
            prev[i]=0;
            next[i]=h.length-1;
        }
        for(int i=0;i<h.length;i++)
        {
            while(!st.isEmpty()&&h[st.peek()]>h[i])
            {
                next[st.peek()]=i-1;
                st.pop();
            }
            st.push(i);
        }
        st.clear();
        for(int i=h.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&h[st.peek()]>=h[i])
            {
                prev[st.peek()]=i+1;
                st.pop();
            }
            st.push(i);
        }
        int count=0;
        for(int i=0;i<h.length;i++)
        {
           
            if(prev[i]<=k&&k<=next[i])
                count=h[i]*(next[i]-prev[i]+1);
            if(count>max&&prev[i]<=k&&k<=next[i])
            {
                max=count;
                System.out.println(i+" max: "+max+" prev"+prev[i]+" next"+next[i]);
            }
        }
        return max;
    }
}
