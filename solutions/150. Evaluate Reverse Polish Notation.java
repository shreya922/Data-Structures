class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        int a=0,b=0;
        for(int i=0;i<tokens.length;i++)
        {
            try{
                st.push(Integer.parseInt(tokens[i]));
            }catch(Exception ex){
           if(!st.isEmpty())
                 a=(int)st.pop();
                 if(!st.isEmpty())
                 b=(int)st.pop();
                System.out.print(b+a);
                if(tokens[i].equals("+"))
                    st.push(b+a);
                else if(tokens[i].equals("*"))
                    st.push(b*a);
                else if(tokens[i].equals("/"))
                    st.push(b/a);
                else if(tokens[i].equals("-"))
                    st.push(b-a);
            }
        }
        return st.pop();
    }
}
