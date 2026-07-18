class Solution {
    public int findGCD(int[] nums) {
        int big=nums[0];
        int small=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>big){
                big=nums[i];
            }
            if(nums[i]<small){
                small=nums[i];
            }
        }
        return gcd(big,small);
       

        
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna