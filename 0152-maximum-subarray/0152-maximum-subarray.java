class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int best=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i], curr+nums[i]);
            best=Math.max(curr,best);
        }
        return best;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna