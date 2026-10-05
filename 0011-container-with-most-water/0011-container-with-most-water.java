class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
             int area=(right-left)*Math.min(height[left],height[right]);
             max=Math.max(max,area);
             if(height[left]<height[right]){
                left++;
             }else{
                right--;
             }


        }
        return max;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna