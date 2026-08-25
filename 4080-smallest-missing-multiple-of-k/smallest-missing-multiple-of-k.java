class Solution {
    public int missingMultiple(int[] nums, int k) {
        if(nums.length==1 && nums[0]==k) return k*2;
        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int multiple=k;
        while(set.contains(multiple)){
            multiple+=k;
        }
        return multiple;
    }
}