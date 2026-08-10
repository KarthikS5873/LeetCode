class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lm=Integer.MIN_VALUE,rm=Integer.MIN_VALUE;
        int water=0;
        while(l<r){
            if(height[l]<=height[r]){
                lm=Math.max(lm,height[l]);
                water+=lm-height[l];
                l++;
            }
            else{
                rm=Math.max(rm,height[r]);
                water+=rm-height[r];
                r--;
            }
        }
        return water;
    }
}