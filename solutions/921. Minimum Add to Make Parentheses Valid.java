class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<Character>();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push('(');
            else
            {
                if(!st.isEmpty())
                    st.pop();
                else
                    a++;
            }
        }
        while(!st.isEmpty())
        {
            st.pop();
            a++;
        }
        return a;
    }
}
