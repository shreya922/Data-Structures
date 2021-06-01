class Solution {
    public int calculate(String s) {
     Stack<Character> st=new Stack<Character>();
        Boolean flag=false;
        s="("+s+")";
        s=s.replaceAll(" ","");
        int num=0;
        int i=0;
             String[] tokens=new String[200000];
        int k=0;   
​
        while(i<s.length())
        {
          
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
               num=0;
               
               while(i!=s.length()&&Character.isLetterOrDigit(s.charAt(i)))
               {
                  
                   num=(num*10)+(int)(s.charAt(i)-48);
                    i++;
                   //System.out.println(num);
               }
               
               i--;
               
               tokens[k++]=String.valueOf(num);
           }
            else if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')')
            {
                while(!st.isEmpty()&&st.peek()!='(')
                {
                    tokens[k++]=String.valueOf(st.pop());
                }
                
                if(!st.isEmpty())
                st.pop();
            }
            else
            {
                flag=true;
                 while (!st.isEmpty() && prec(s.charAt(i)) 
                         <=prec(st.peek())){
                    
                    tokens[k++]=String.valueOf(st.pop());
             }
                st.push(s.charAt(i));
            }
            i++;
        }
   // System.out.print(res);
        if(flag==false)
        {
            return Integer.parseInt(tokens[0]);
        }
        
      
          Stack<Integer> st1=new Stack<Integer>();
        
        int a=0,b=0;
        for( i=0;i<k;i++)
        {
            try{
                st1.push(Integer.parseInt(tokens[i]));
            }catch(Exception ex){
           if(!st1.isEmpty())
                 a=(int)st1.pop();
                 if(!st1.isEmpty())
                 b=(int)st1.pop();
                if(tokens[i].equals("+"))
                {
                    st1.push(b+a);
                }
                else if(tokens[i].equals("*"))
                    st1.push(b*a);
                else if(tokens[i].equals("/"))
                    st1.push(b/a);
                else if(tokens[i].equals("-"))
                    st1.push(b-a);
            }
        }
        return st1.pop();
    }
    public int prec(char c)
    {
        switch(c)
        {
            case '+':
            case '-':return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;
        }
        return -1;
    }
}
