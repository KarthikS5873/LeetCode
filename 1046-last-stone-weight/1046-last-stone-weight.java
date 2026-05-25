class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            q.add(num);
        }
        while(q.size()>1){
            int y=q.remove();
            int x=q.remove();
            if(x!=y){
                q.add(y-x);
            }
        }
        return q.isEmpty() ? 0 : q.peek();
    }
}