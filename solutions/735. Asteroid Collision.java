class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<Integer>();
        for(int ast:a)
        {
            collision:
            {
                while(!st.isEmpty()&&st.peek()>0&&ast<0)
                {
                    if(st.peek()<-ast)
                    {
                        st.pop();
                        continue;
                    }
                    else if(st.peek()==-ast)
                        st.pop();
                    break collision;
                }
                st.push(ast);
            }
        }
        int[] ans=new int[st.size()];
        int k=ans.length-1;
        while(!st.isEmpty())
        {
            ans[k--]=st.pop();
        }
        return ans;
    }
}
