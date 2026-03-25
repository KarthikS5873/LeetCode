class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D") ){
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){
                int s1=st.pop();
                int s2=st.pop();
                st.push(s2);                    
                st.push(s1);
                st.push(s2+s1);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}