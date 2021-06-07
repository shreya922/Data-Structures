class Solution {
    public boolean find132pattern(int[] nums) {
     Stack<Integer> st=new Stack<Integer>();
       int[] leftmin=new int[nums.length];
        leftmin[0]=nums[0];
        int i=0;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]<leftmin[i-1])
                leftmin[i]=nums[i];
            else
                leftmin[i]=leftmin[i-1];
            System.out.println(leftmin[i]+" ");
        }
        int k=0,left=0,right=0;
        for(i=nums.length-1;i>=0;i--)
        {
            k=nums[i];//middle
            left=leftmin[i];
            while(!st.isEmpty()&&st.peek()<=left)
                    st.pop();  
            if(!st.isEmpty()&&st.peek()<k)
                return true;
​
                st.push(k);
                
                
            }
            
        
        return false;
    }
}
