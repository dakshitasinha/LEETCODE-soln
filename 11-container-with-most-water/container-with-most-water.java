class Solution {
    public int maxArea(int[] height) {

        // Start with widest possible container
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            // Distance between lines
            int width = right - left;

            // Water level is limited by shorter line
            int h = Math.min(height[left], height[right]);

            // Calculate current area
            int area = width * h;

            // Update maximum area found so far
            maxArea = Math.max(maxArea, area);

            // Move the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}