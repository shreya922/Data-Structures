class MinStack {
Stack<Integer> st=new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.add(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
      return st.peek();  
    }
    
    public int getMin() {
        Stack<Integer> st1=new Stack<Integer>();
       int min=Integer.MAX_VALUE;
        while(!st.isEmpty())
        {
            int x=st.peek();
            if(x<min)
                min=x;
            st1.push(st.pop());
        }
        while(!st1.isEmpty())
        {
           st.push(st1.pop()); 
        }
        return min;
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
