class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] num,int start){
        res.add(new ArrayList(temp));
        for(int i=start;i<num.length;i++){
            temp.add(num[i]);
            backtrack(res,temp,num,i+1);
            temp.remove(temp.size()-1);
        }
    }
}