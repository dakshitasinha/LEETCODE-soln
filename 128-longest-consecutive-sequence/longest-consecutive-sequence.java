class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0, max=0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i:set){
            if(!set.contains(i+1)){
                int current = i;
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