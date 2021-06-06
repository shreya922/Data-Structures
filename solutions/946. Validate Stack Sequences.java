class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<pushed.length;i++)
        {
            map.put(pushed[i],i);
        }
        int f=0,i=0;
        for(i=0;i<popped.length;i++)
        {
            int a=map.get(popped[i]);
            System.out.print(a);
            if(a==-1)
                return false;
           
            for(int j=f;j<=a;j++)
            {
                st.push(pushed[j]);
                
            }
            st.pop();
            if(!st.isEmpty()&&(i+1)!=popped.length&&st.contains(popped[i+1])&&st.peek()!=popped[i+1])
            {
                return false;
            }
            while(!st.isEmpty()&&(i+1)!=popped.length&&st.peek()==popped[i+1])
            {
                i++;
                st.pop();
            }
            f=a+1;
            if(f>=pushed.length)
                break;
        }
        //System.out.print(i);
        for(int j=i+1;j<popped.length;j++)
        {
            if(st.isEmpty())
                return false;
            if(popped[j]==st.peek())
                st.pop();
            else
                return false;
        }
        return true;
    }
}
