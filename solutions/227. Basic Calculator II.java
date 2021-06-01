class Solution {
    public int calculate(String s) {
     Stack<Character> st=new Stack<Character>();
        Boolean flag=false;
        s="("+s+")";
        //s=s.replaceAll(" ","");
        String res="";
        int num=0;
        int i=0;
        //char[] ch=s.toCharArray();
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
                continue;
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
               num=0;
               i++;
               while(i!=s.length()&&Character.isLetterOrDigit(s.charAt(i)))
               {
                  
                   num=(num*10)+((int)(s.charAt(i)));
                    i++;
                   System.out.println(num);
               }
               i--;
               
               res=res+String.valueOf(num);
           }
            else if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')')
            {
                while(!st.isEmpty()&&st.peek()!='(')
                {
                    res=res+st.pop();
                }
                
                st.pop();
            }
            else
            {
                flag=true;
                if(!st.isEmpty()&&prec(st.peek())>=prec(s.charAt(i)))
                    st.push(s.charAt(i));
                else
                {
                    while(!st.isEmpty()&&st.peek()!='(')
                        res=res+st.pop();
                    st.push(s.charAt(i));
                }
            }
            i++;
