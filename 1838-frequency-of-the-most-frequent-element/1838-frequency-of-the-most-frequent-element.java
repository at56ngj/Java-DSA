import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long windowsum = 0;
        int l = 0;      // left wala pointer
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {      // fix 1: -1 hataya
            windowsum += nums[r];

            long cost = (long) nums[r] * (r - l + 1) - windowsum;   // fix 2: (long) cast
            while (cost > k) {
                windowsum -= nums[l];
                l++;
                cost = (long) nums[r] * (r - l + 1) - windowsum;    // yahan bhi cast
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna