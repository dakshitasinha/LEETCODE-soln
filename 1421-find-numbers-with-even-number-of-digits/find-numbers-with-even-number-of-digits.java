class Solution {
    public int findNumbers(int[] nums) {
        int evenDig=0;
        for(int i=0; i<nums.length; i++){
            if(getCount(nums[i])%2==0){
                evenDig++;
            }
        }
        return evenDig;
    }

    private int getCount(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}