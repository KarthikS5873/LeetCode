class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            q.offer(num);
        }
        while(q.size()>1){
            int y=q.poll();
            int x=q.poll();
            if(x!=y){
                q.offer(y-x);
            }
        }
        return q.isEmpty() ? 0 : q.peek();
    }
}