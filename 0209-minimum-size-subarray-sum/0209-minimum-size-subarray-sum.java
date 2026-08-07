class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int mincount=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            while(sum>=target){
                mincount=Math.min(mincount,j-i+1);
                sum=sum-nums[i];
                i++;    
            }
        }
        if(mincount==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return mincount;    
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna