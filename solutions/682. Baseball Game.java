class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("+"))
            {
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(ops[i].equals("D"))
            {
                int a=st.peek();
                st.push(2*a);
            }
            else if(ops[i].equals("C"))
            {
                st.pop();
            }
            else
            {
                int x=Integer.parseInt(ops[i]);
                    st.push(x);
                
            }
        }
        int sum=0;
        while(!st.isEmpty())
        {
           sum=sum+st.pop();
        }
        return sum;
    }
}
