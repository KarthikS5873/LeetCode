class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        int t1=1;
        for(int i=0;i<n;i++){
            t1*=nums[i];
            pre[i]=t1;
        }
        int t2=1;
        for(int i=n-1;i>=0;i--){
            t2*=nums[i];
            suf[i]=t2;
        }
        int ans[] =new int[n];
        for(int i=0;i<n;i++){
            if(i-1<0){
                ans[i]=suf[i+1];
            }
            else if(i+1>n-1){
                ans[i]=pre[i-1];
            }
            else{
                ans[i]=pre[i-1]*suf[i+1];
            }
        }
        return ans;
    }
}