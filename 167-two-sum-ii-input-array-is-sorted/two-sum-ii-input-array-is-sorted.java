class Solution {
    public int[] twoSum(int[] n, int target) {
        int left=0;
        int right= n.length-1;

        while(left<right){
            int sum = n[left]+n[right];

            if(sum==target){
                return new int[] {left+1, right+1};
            } else if(sum<target){
                left++;
            } else{
                right--;
            }
        }
        return new int[] {-1,-1};

    }
}