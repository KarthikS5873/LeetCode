class Solution {
    public boolean validPalindrome(String s) {
        int del=0;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return isPalin(s,i,j-1) || isPalin(s,i+1,j);
            }
        }
        return true;
    }
    boolean isPalin(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}