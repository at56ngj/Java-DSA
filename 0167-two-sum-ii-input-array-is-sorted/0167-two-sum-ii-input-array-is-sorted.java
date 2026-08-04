class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int a=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum==target){
                arr[a]=left+1;
                arr[a+1]=right+1;
                return arr;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
            
        }
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna