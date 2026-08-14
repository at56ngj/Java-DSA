class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
         
        while(left<right){
           int mid=left+ (right-left)/2;
            if(nums[mid]>nums[right]){
                //then ye minm elemt mid aur right ke beech hi hai, left ko mid+1 kardo.
                left=mid+1; 
            }
            else{
                //mid, right se chota ya equal hai, then, left se lekar mid tak pura sorted arr hai
                right=mid;
            }
        }
        return nums[left];
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna