import java.util.Stack;
class MyQueue {
    Stack<Integer> ins=new Stack<>();
    Stack<Integer> ous=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        ins.push(x);
    }
    
    public int pop() {
        if(ous.isEmpty()){
            while(!ins.isEmpty()){
                ous.push(ins.pop());
            }
        }
        return ous.pop();
    }
    
    public int peek() {
        if(ous.isEmpty()){
            while(!ins.isEmpty()){
                ous.push(ins.pop());
            }
        }
        return ous.peek();
    }
    
    public boolean empty() {
        return ins.isEmpty() && ous.isEmpty();
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