class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i:nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key: freq.keySet()){
            int count = freq.get(key);

            if(bucket[count]==null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(key);
        }
        
        int[] res = new int[k];
        int index=0;

        for(int i=bucket.length-1; i>=0 && index<k; i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    res[index++]= num;
                    if(index==k) break;
                }
            }
        }   
        return res;
    }
}