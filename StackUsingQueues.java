class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);

    }
    
    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }
        int temp = q1.remove();
        Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        return temp;
    }
    
    public int top() {
        if(q1.isEmpty()){
            return -1;
        }
       while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }
        int temp = q1.remove();
        q2.add(temp);
        Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        return temp;
    }
    
    public boolean empty() {
        if(q1.size() == 0){
            return true;
        }else{
            return false;
        }
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
