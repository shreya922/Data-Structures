class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
         if(!st.contains(s.charAt(i)))
         {
                 while(!st.isEmpty()&&st.peek()>s.charAt(i)&&s.indexOf(st.peek(),i)!=-1)
            {
                st.pop();
            }
             st.push(s.charAt(i)); 
         }
                
         }
           
        
        String res="";
        while(!st.isEmpty())
        {
            res=res+st.pop();
        }
        StringBuilder sb=new StringBuilder(res);
        sb=sb.reverse();
        return sb.toString();
    }
}
