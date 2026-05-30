class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                map.put(edges[i][j],map.getOrDefault(edges[i][j],0)+1);
            }
        }
        for(int val:map.keySet()){
            if(map.get(val)==edges.length){
                return val;
            }
        }
        return -1;
    }
}