class Solution {
    public String decodeString(String s) {
        if(s.indexOf("[")==-1)
            {
                return s;
            }
        int i=0;
        Stack<String> st=new Stack<String>();
        while(i<s.length())
        {
           while(i<s.length()&&!String.valueOf(s.charAt(i)).equals("]"))
           {
               int num=0;
               if(Character.isDigit(s.charAt(i)))
               {
                   while(!String.valueOf(s.charAt(i)).equals("["))
                   {
                      num=num*10+(s.charAt(i)-'0');
                       i++;
                   }
                   st.push(num+"");
               }
               else
               {
               st.push(s.charAt(i)+"");
                     i++;
               }
             
           }
            String x="";
            while(!st.isEmpty()&&!(st.peek().equals("[")))
            {
               x=st.pop()+x; 
            }
            StringBuilder sb=new StringBuilder(x);
           // sb=sb.reverse();
            x=new String(sb.toString());
            st.pop();
            int a=Integer.parseInt(st.pop());
            String temp=x;
            for(int j=1;j<a;j++)
                x=x+temp;
            st.push(x);
            System.out.println(x);
            i++;
            if(s.indexOf("]",i)==-1)
            {
                st.push(s.substring(i));
                break;
            }
        }
        String f="";
        while(!st.isEmpty())
        {
           f=st.pop()+f; 
        }
        return f;
    }
}
