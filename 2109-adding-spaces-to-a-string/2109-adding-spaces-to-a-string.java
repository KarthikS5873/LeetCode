class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ss= new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j<spaces.length && i==spaces[j]){
                ss.append(" ");
                j++;
            }
            ss.append(s.charAt(i));
        }
        return ss.toString();
    }
}