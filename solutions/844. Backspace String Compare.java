class Solution {
    public boolean backspaceCompare(String s, String t) {
        int x=0,y=0;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Stack<Character> st=new Stack<Character>();
        Stack<Character> st1=new Stack<Character>();
        while(x<a.length)
        {
           if(a[x]!='#')
               st.push(a[x]);
            else if(!st.isEmpty())
                st.pop();
            x++;
        }
        s="";
        while(!st.isEmpty())
        {
            s=s+String.valueOf(st.pop());
        }
        
        while(y<b.length)
        {
           if(b[y]!='#')
               st1.push(b[y]);
            else if(!st1.isEmpty())
                st1.pop();
            y++;
        }
        t="";
        while(!st1.isEmpty())
        {
            t=t+String.valueOf(st1.pop());
        }
        if(s.equals(t))
            return true;
        return false;
    }
}
