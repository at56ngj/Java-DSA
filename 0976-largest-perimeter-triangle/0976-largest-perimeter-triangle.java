import java.util.*;
class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       for(int i=n-1;i>=2;i--){
        if(nums[i]<nums[i-1]+nums[i-2]){
            return nums[i]+nums[i-1]+nums[i-2];
        }
       }
       return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna