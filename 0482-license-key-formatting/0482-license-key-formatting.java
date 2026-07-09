class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuffer sb=new StringBuffer();
        for(char ch:s.toCharArray()){
            if(ch!='-')
                sb.append(Character.toUpperCase(ch));
        }
        sb.reverse();
        StringBuffer ans=new StringBuffer();
        for(int i = 0; i < sb.length(); i++){
            if(i>0 && i%k==0){
                ans.append('-');
            }
            ans.append(sb.charAt(i));
        }
        return ans.reverse().toString();
    }
}