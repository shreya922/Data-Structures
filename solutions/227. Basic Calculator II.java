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
