class MinStack {
    Node head;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head==null){
            head=new Node(val,val,null);
        }else{
            head=new Node(val,Math.min(head.min,val),head);
        }
    }
    
    public void pop() {
        if(head!=null)
        head=head.next;
    }
    
    public int top() {
        if(head==null)return -1;
        return head.value;
    }
    
    public int getMin() {
        return head.min;
    }
}
public class Node{
    int value;
    int min;
    Node next;
    Node(int value){
        this.value=value;
    }
    Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
    Node(int value,int min,Node next){
        this.value=value;
        this.min=min;
        this.next=next;
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */