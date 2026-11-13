class Solution {
    public int maxSubArray(int[] nums) {
        int subarr[]=new int[nums.length];
        int sum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            sum=Math.max(currentsum,sum);
            
        }
        return sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna