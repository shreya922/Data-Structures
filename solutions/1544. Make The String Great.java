class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
                st.push(s.charAt(i));
            else
            {
                char x=st.peek();
                char curr=s.charAt(i);
                if((x+32)==curr||(curr+32)==x)
                    st.pop();
                else
                    st.push(curr);
            }
        }
         s="";
        while(!st.isEmpty())
        {
            s=s+st.pop();
        }
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        return sb.toString();
    }
}
