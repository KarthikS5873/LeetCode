class Solution {
    public String minWindow(String s, String t) {
        int start=0,len=Integer.MAX_VALUE;
        int size=0,l=0,r=0;
        Map<Character,Integer> sub=new HashMap<>();
        for(char c:t.toCharArray()){
            sub.put(c,sub.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> wid=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            wid.put(ch,wid.getOrDefault(ch,0)+1);
            if(sub.containsKey(ch) && sub.get(ch).intValue()==wid.get(ch).intValue()){
                size++;
            }
            while(size==sub.size()){
                if(r-l+1<len){
                    len=r-l+1;
                    start=l;
                }
                char rem=s.charAt(l);
                wid.put(rem,wid.get(rem)-1);
                if(sub.containsKey(rem) && wid.get(rem)<sub.get(rem)){
                    size--;
                }
                l++;
            }
            r++;
        }
        if(len==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+len);
    }
}