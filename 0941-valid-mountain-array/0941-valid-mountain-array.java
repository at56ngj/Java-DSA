class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
     for(int i=1;i<arr.length-1;i++){
        //finding peak
        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            int left=i;
            int right=i;
            while(left>0 && arr[left-1]<arr[left]){
               left--;
            }
            while(right<arr.length-1 && arr[right]>arr[right+1]){
               right++;
            }
            return (left==0 && right==arr.length-1);
        }
       
        
     }
     return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna