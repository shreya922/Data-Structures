class Solution {
    //ye khud se nhi kiya but ye concept acha h,so have to learn it.
    public String removeDuplicateLetters(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.contains(s.charAt(i)))
            {
                while(!st.isEmpty()&&s.charAt(i)<st.peek()&&s.indexOf(st.peek(),i)!=-1)
                    st.pop();
            }
            else
                continue;
            st.push(s.charAt(i));
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
