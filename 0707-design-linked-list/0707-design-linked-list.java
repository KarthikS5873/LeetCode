class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    Node head,tail;
    int ct;
    public MyLinkedList() {
        head=tail=null;
        ct=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=ct){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=nn;
            tail=nn;
            ct++;
            return;
        }
        nn.next=head;
        head=nn;
        ct++;
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(tail==null){
            head=nn;
            tail=nn;
            ct++;
            return;
        }
        tail.next=nn;
        tail=nn;
        ct++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>ct){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==ct){
            addAtTail(val);
            return;
        }
        Node nn=new Node(val);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
        ct++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=ct){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null) tail=null;
            ct--;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        ct--;
        if(temp.next==null) tail=temp;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */