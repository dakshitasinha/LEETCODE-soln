class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int totalWindows = n - k + 1;

        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
        }

        int ans = -1;

        for (int x : first.keySet()) {
            int f = first.get(x);
            int l = last.get(x);

            int before = Math.max(0, f - k + 1);
            int after = Math.max(0, n - l - k);

            int containing = totalWindows - before - after;

            if (containing == 1) {
                ans = Math.max(ans, x);
            }
        }

        return ans;
    }
}