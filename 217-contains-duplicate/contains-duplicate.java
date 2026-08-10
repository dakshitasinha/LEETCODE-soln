class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<2) return false;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            } else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}