class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,rep=0,ws=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rep++;
            }
            while(rep>1){
                if(nums[ws]==0) rep--;
                ws++;
            }
            max=Math.max(max,i-ws);
        }
        return max;
    }
}