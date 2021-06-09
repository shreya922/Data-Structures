class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int i=0;
        Stack<Integer> st=new Stack<Integer>();
        while(i<nums.length)
        {
            while(!st.isEmpty()&&st.peek()>nums[i]&&(nums.length-i+st.size()-1>=k))
            {
                st.pop();
            }
            st.push(nums[i]);
            i++;
        }
        //System.out.print(st.pop()+st.pop());
        int j=k-1;
            int[] arr=new int[k];
        while(st.size()>k)
        {
            st.pop();
        }
        while(!st.isEmpty()&&j>-1)
        {
        arr[j]=st.pop();
            j--;
        }
            return arr;
    }
}
