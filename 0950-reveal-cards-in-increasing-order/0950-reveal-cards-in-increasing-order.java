class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int ans[]=new int[deck.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        int i=0;
        while(!q.isEmpty() && i<deck.length){
            int idx=q.poll();
            q.offer(q.poll());
            ans[idx]=deck[i];
            i++;
        }
        return ans;
    }
}