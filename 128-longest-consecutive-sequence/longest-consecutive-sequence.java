class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count=0, max=0;

        for(int i:nums){
            set.add(i);
        }

        for(int i:set){
            if(!set.contains(i+1)){
                int current=i;
                count=1;
                while(set.contains(current-1)){
                    count++;
                    current--;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}