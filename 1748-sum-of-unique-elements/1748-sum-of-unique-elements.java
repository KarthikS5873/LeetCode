class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet())
        {
            if(map.get(k)==1)
            {
                list.add(k);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }
}