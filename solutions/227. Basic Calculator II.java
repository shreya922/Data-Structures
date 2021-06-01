class Solution {
    public int calculate(String s) {
     Stack<Character> st=new Stack<Character>();
        Boolean flag=false;
        s="("+s+")";
        s=s.replaceAll(" ","");
        String res="";
        int num=0;
        int i=0;
        //char[] ch=s.toCharArray();
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
               
               res=res+String.valueOf(num)+" ";
           }
            else if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')')
            {
                while(!st.isEmpty()&&st.peek()!='(')
                {
                    res=res+st.pop()+" ";
                }
                
                if(!st.isEmpty())
                st.pop();
            }
            else
            {
                flag=true;
                 while (!st.isEmpty() && prec(s.charAt(i)) 
                         <=prec(st.peek())){
                    
                    res += st.pop()+" ";
             }
                st.push(s.charAt(i));
            }
            i++;
        }
    System.out.print(res);
        if(flag==false)
        {
            res=res.trim();
            return Integer.parseInt(res);
        }
        String[] tokens=new String[res.length()];
        int k=0;
      
          Stack<Integer> st1=new Stack<Integer>();
          for(int j=0;j<res.length();j++)
          {
             tokens[k]="";
              while(j<res.length()&&res.charAt(j)!=32)
              {
              tokens[k]=tokens[k]+String.valueOf(res.charAt(j));
                  j++;
              }
                   //System.out.println(tokens[k]);
              k++;
          }
        int a=0,b=0;
        for( i=0;i<k;i++)
        {
            try{
