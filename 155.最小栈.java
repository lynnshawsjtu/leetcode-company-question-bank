class MinStack {
    int []stack;
    int []min;
    int pos=-1;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new int[10000];
        min=new int[10000];
    }
    
    public void push(int x) {
        pos++;
        if(pos==0){
            stack[pos]=x;
            min[pos]=x;
        }else{
            stack[pos]=x;
            min[pos]=Math.min(stack[pos],min[pos-1]);
        }
    }
    
    public void pop() {
        stack[pos]=0;
        min[pos]=0;
        pos--;
    }
    
    public int top() {
        return stack[pos];
    }
    
    public int getMin() {
        return min[pos];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
