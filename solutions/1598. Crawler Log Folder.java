class Solution {
    public int minOperations(String[] logs) {
       Stack<String> st=new Stack<String>();
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../"))
            {
                if(!st.isEmpty())
                st.pop();
            }
            else if(logs[i].equals("./"))
            {
                
            }
            else
            {
                st.push(logs[i]);
            }
        }
            int count=0;
        while(!st.isEmpty())
        {
            st.pop();
            count++;
            
        }
        return count;
    }
}
