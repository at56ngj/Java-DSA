class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int sum = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftmax = Math.max(leftmax, height[left]);
                sum += leftmax - height[left];
                left++;
            } else {
                rightmax = Math.max(rightmax, height[right]);
                sum += rightmax - height[right];
                right--;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna