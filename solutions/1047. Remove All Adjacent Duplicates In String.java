class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty()&&st.peek()==s.charAt(i))
                st.pop();
            else
            {
                st.push(s.charAt(i));
            }
        }
        s="";
        while(!st.isEmpty())
        {
            s=st.pop()+s;
        }
        return s;
    }
}
