                String res="";
                while(!st.isEmpty()&&!st.peek().equals("("))
                {
                    res=res+st.pop();
                }
                st.pop();
                int x=0;
                while(x<res.length())
                {
                   st.push(String.valueOf(res.charAt(x)));
                    x++;
                }
               
            }
        }
        String fz="";
        while(!st.isEmpty())
        {
            fz=fz+st.pop();
        }
        StringBuilder sb=new StringBuilder(fz);
        sb=sb.reverse();
                        return left+sb.toString()+right;
    }
}
