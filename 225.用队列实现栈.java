class MyStack {
    private Queue<Integer> a;
    private Queue<Integer> b;
    /** Initialize your data structure here. */
    public MyStack() {
        a=new LinkedList<>();
        b=new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        a.offer(x);
        //将b队列中全部元素都给a队列
        while(!b.isEmpty()){
            a.offer(b.poll());
        }
        //交换两个队列
        Queue temp=a;
        a=b;
        b=temp;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return b.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return b.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return a.isEmpty()&&b.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
