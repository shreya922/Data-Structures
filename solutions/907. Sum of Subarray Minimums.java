class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st1=new Stack<Integer>();
        Stack<Integer> st2=new Stack<Integer>();
        int[] prev_smaller=new int[arr.length];
        int[] next_smaller=new int[arr.length];
   // st1.push(0);
        for(int i=0;i<arr.length;i++)
        {
            prev_smaller[i]=i;
            next_smaller[i]=arr.length-i-1;
        }
        for(int i=0;i<arr.length;i++)
        {
            while(!st1.isEmpty()&&arr[st1.peek()]>=arr[i])
            {
                next_smaller[st1.peek()]=i-st1.peek()-1;
                st1.pop();
            }
            st1.push(i);
        }
       // st2.push(arr.length-1);
         for(int i=arr.length-1;i>=0;i--)
        {
            while(!st2.isEmpty()&&arr[st2.peek()]>arr[i])
            {
                prev_smaller[st2.peek()]=st2.peek()-i-1;
                st2.pop();
            }
            st2.push(i);
        }
        int sum=0;
          int mod = (int) Math.pow(10, 9) + 7;
        for(int i=0;i<arr.length;i++)
        {
         sum+=((long)(arr[i]*(prev_smaller[i]+1))*(next_smaller[i]+1))%mod; 
          sum%=mod;
        }
        return sum;
    }
}
