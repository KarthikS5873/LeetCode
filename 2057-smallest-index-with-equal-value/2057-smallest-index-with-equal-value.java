class Solution {
    public int smallestEqual(int[] nums) {
        int k=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i%10==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}