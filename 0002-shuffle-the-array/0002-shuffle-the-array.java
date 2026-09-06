class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i=i+2){
            arr[i]=nums[a];
            a++;
        }
        for(int j=1;j<nums.length;j=j+2){
            arr[j]=nums[n];
            n++;
        }
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna