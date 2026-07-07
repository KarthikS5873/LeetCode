class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        String e="";
        for(int i=arr.length-1;i>=0;i--){
            e+=arr[i]+" ";
        }
        return e.trim();
    }
}