class Solution {
    public int findPeakElement(int[] nums) {
        int n =nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }

        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna