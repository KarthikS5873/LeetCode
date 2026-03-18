class MyQueue {
    Stack<Integer> st;
    Stack<Integer> t;
    public MyQueue() {
        st=new Stack<>();
        t=new Stack<>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            t.push(st.pop());
        }
        st.push(x);
        while(!t.isEmpty()){
            st.push(t.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */