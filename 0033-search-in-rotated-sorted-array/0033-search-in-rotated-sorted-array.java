class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<right){
            if(nums[left]!=target && nums[right]!=target){
                left++;
                right--;
            }
            else if(nums[left]==target){
                return left;
            }
            else{
                return right;
            }
        }
        if(left==right && nums[left]==target){
            return left;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna