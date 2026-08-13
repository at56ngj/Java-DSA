class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int left1=0;
        int left2=0;
        int ans[]=new int[2];
        while(left<right){
            if(nums[left]!=target && nums[right]!=target){
                left++;
                right--;
            }
            else if(nums[left]==target && nums[right]!=target){
                left1=left;
                right--;
            }
            else if(nums[right]==target && nums[left]!=target){
                left2=right;
                left++;
            }
            else{
                left1=left;
                left2=right;
                ans[0]=left1;
                ans[1]=left2;
                return ans;
            }
        }
               ans[0]=-1;
                ans[1]=-1;
                return ans;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna