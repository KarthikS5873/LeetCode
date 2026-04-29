class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> s=new LinkedHashSet<>();
        for(int i:nums){
            s.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>(s);
        Collections.reverse(arr);
        if(s.size()<3){
            return arr.get(0);
        }
        return arr.get(2);
    }
}