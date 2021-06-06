class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<Character>();
        StringBuffer sb=new StringBuffer(s);
        int a=0;
        for(int i=0;i<sb.length();i++)
        {
          if(sb.charAt(i)=='(')
              st.push('(');
            else if(sb.charAt(i)==')')
            {
              if(!st.isEmpty())
                  st.pop();
            else
            {
                sb=sb.deleteCharAt(i);
                i--;
            }
            }
        }
        while(!st.isEmpty())
        {
            a++;
            st.pop();
        }
        for(int i=0;i<a;i++)
        {
            int b=sb.lastIndexOf("(");
            sb=sb.deleteCharAt(b);
        }
        return sb.toString();
    }
}
