class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=nums1.length-1,j=nums2.length-1,k=nums1.length+nums2.length-1;
        int arr[]=new int[k+1];
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                arr[k]=nums1[i];
                i--;
            }
            else{
                arr[k]=nums2[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            arr[k] = nums1[i];
            i--;
            k--;
        }

        while (j >= 0) {
            arr[k] = nums2[j];
            j--;
            k--;
        }
        int a=arr.length;
        if(a%2==1){
            return arr[a/2];
        }
        else{
            return (arr[a / 2 - 1] + arr[a / 2]) / 2.0;
        }
    }
}