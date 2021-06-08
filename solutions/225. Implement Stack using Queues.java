class MyStack {
Queue<Integer> q1=new LinkedList<Integer>();
    Queue<Integer> q2=new LinkedList<Integer>();
    private int top;
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        top=x;
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!q1.isEmpty())
        {
            return q1.remove();
        }
        return -1;
    }
    
    /** Get the top element. */
    public int top() {
       return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.isEmpty())
            return true;
        return false;
    }
}
​
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
