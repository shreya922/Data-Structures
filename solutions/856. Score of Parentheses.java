class Solution {
    public int scoreOfParentheses(String s) {
        int score=0,res=0;
        Stack<String> st=new Stack<String>();
        for(int i=0;i<s.length();i++)
        {
            score=0;
            String f=Character.toString(s.charAt(i));
            if(f.equals("("))
            {
                
                score=0;
                st.push("(");
            }
            else
            {
                if(st.peek().equals("("))
                {
                     st.pop();
                    st.push("1");
                   
                }
                else
                {
                    while(!st.isEmpty()&&!st.peek().equals("("))
                    {
                        score=score+Integer.parseInt(st.pop());
                    }
                    st.pop();
                    score=2*score;
                    st.push(String.valueOf(score));
                    
                }
            }
        }
        score=0;
        while(!st.isEmpty())
        {
            score=score+Integer.parseInt(st.pop());
        }
        return score;
    }
}
