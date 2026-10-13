class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        long total = 0;

        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
            total += sq[i];
        }

        Arrays.sort(sq);

        long small = 0;
        for (int i = 0; i < n / 2; i++) {
            small += sq[i];
        }

        return total - 2 * small;
    }
}