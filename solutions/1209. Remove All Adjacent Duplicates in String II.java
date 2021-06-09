class Solution {
    public String removeDuplicates(String s, int k) {
        //dekh kar kiya
       Stack<Integer> st=new Stack<Integer>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(sb.length()==0||c!=sb.charAt(sb.length()-1))
            {
                st.push(1);
                sb.append(c);
            }
            else
            {
               int currcount=st.pop();
                currcount++;
                if(currcount==k)
                    sb.delete(sb.length()-k+1,sb.length());
                else
                {
                    st.push(currcount);
                    sb.append(c);
                }
            }
        }
        return sb.toString();
        
    }
}
