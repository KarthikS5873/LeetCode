class Solution {
    public int findMinMoves(int[] machines) {
        int n=machines.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=machines[i];
        }
        int avg=sum/n;
        int balance=0;
        int ans=0;
        if(sum%n!=0){
            return -1;
        }
        for(int i=0;i<n;i++){
            int diff=machines[i]-avg;
            balance+=diff;
            ans=Math.max(ans,Math.max(Math.abs(balance),diff));
        }
        return ans;
    }
}