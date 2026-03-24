class BrowserHistory {
    class Node{
        String url;
        Node prev;
        Node next;
        Node(String url){
            this.url=url;
            prev=next=null;
        }
    }
    Node cur;
    public BrowserHistory(String homepage) {
        Node nn=new Node(homepage);
        cur=nn;
    }
    
    public void visit(String url) {
        Node nn=new Node(url);
        cur.next=nn;
        nn.prev=cur;
        cur=nn;
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(cur.prev!=null) cur=cur.prev;
        }
        return cur.url;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(cur.next!=null) cur=cur.next;
        }
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */