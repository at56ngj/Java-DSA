class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans=0;
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna