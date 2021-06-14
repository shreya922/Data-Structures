class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length())
            return "0";
        Stack<String> st=new Stack<String>();
        int count=0;
        for(int i=0;i<num.length();i++)
        {
            while(!st.isEmpty()&&Integer.parseInt(st.peek())>Integer.parseInt(String.valueOf(num.charAt(i)))&&count!=k)
            {
                st.pop();
                count++;
            }
            st.push(String.valueOf(num.charAt(i)));   
        }
        while(count!=k)
        {
         st.pop();
            count++;
        }
        String x="";
        while(!st.isEmpty())
        {
            x=st.pop()+x;
        }
       StringBuilder sb=new StringBuilder(x);
        int i=0;
        while(sb.length()!=0&&sb.charAt(i)=='0'&&sb.length()!=1)
        {
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}
