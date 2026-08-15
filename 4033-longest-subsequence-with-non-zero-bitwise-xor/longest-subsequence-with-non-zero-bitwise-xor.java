class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        int nonZero = 0;

        for (int x : nums) {
            xor ^= x;
            if (x != 0) {
                nonZero++;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        if (nonZero == 0) {
            return 0;
        }

        return nums.length - 1;
    }
}