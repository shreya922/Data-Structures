class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> st=new ArrayList<String>();
        int x=1;
        for(int i=0;i<target.length;i++)
        {
            
            if(target[i]!=x)
            {
                st.add("Push");
                st.add("Pop");
                i--;
            }
            else
            {
                   st.add("Push"); 
            }
            x++;
        }
        return st;
    }
}
