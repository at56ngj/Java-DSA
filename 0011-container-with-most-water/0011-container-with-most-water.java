class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            int area=(right-left)*min;
            max=Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }
           else{
             right--;
           }
           

        }
        return max;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna