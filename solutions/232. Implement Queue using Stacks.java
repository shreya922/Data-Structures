class MyQueue {
Stack<Integer> st1=new Stack<Integer>();
    Stack<Integer> st2=new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        //MyQueue myQueue = new MyQueue();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!st1.isEmpty())
        {
          st2.push(st1.pop());  
        }
        st2.push(x);
        while(!st2.isEmpty())
        {
            st1.push(st2.pop()); 
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!st1.isEmpty())
        return st1.pop();
        return -1;
    }
    
    /** Get the front element. */
    public int peek() {
