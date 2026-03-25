/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node up=curr.next;
                curr.next=flatten(curr.child);
                curr.child=null;
                curr.next.prev=curr;
                while(curr.next!=null){
                    curr=curr.next;
                }
                if(up!=null){
                    curr.next=up;
                    up.prev=curr;
                }
            
            }
            curr=curr.next;
        }
        return head;
    }
}