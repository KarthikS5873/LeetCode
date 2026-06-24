class Solution {
    public String removeOccurrences(String s, String part) {
        int m=part.length();
        StringBuilder s1=new StringBuilder();
        for(char ch:s.toCharArray()){
            s1.append(ch);
            if(s1.length()>=m){
                if(s1.substring(s1.length()-m).equals(part)){
                    s1.delete(s1.length()-m,s1.length());
                }
            }
        }
        return s1.toString();
    }
}