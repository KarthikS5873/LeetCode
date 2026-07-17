class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int t=0,b=n-1,l=0,r=n-1;
        int cnt=1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                arr[t][i]=cnt;
                cnt++;
            }
            t++;
            for(int i=t;i<=b;i++){
                arr[i][b]=cnt;
                cnt++;
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    arr[b][i]=cnt;
                    cnt++;
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    arr[i][l]=cnt;
                    cnt++;
                }
                l++;
            }
        }
        return arr;
    }
}