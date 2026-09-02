class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int n=accounts.length;
        for(int i=0;i<accounts.length;i++){
                    int ans=0;
            for(int j=0;j<accounts[i].length;j++){
                ans+=accounts[i][j];
            }
            max=Math.max(ans,max);
            System.out.println(ans);
        }
        return max;
    }
}