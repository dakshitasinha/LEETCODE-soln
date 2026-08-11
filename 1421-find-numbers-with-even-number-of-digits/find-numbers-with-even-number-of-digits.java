class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int dig = String.valueOf(nums[i]).length();
            if(dig%2==0){
                count++;
            }
        }
    return count;
    }
}