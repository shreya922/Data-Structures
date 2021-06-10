class CustomStack {
private int maxSize=0,top=0;
    Stack<Integer> st=new Stack<Integer>();
      Stack<Integer> st1=new Stack<Integer>();
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(top<maxSize)
        {
            st.push(x);
            top++;
        }
    }
    
    public int pop() {
        if(st.isEmpty())
            return -1;
        top--;
        return st.pop();
    }
    
    public void increment(int k, int val) {
        if(st.size()<=k)
        {
            while(!st.isEmpty())
            {
                st1.push(st.pop()+val);
            }
            while(!st1.isEmpty())
            {
                st.push(st1.pop());
            }
        }
        else
        {
            int x=st.size()-k,j=0;
            while(j!=x)
            {
