class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<2) return false;
        Set<Integer> set = new HashSet<>(nums.length*2);

        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;

    }
}