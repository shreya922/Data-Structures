class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
                st.push(s.charAt(i));
            else
            {
                char x=st.peek();
                if(x==s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
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
