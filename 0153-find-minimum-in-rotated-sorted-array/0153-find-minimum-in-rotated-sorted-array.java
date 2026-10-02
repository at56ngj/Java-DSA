import java.util.*;
class Solution {
    public int findMin(int[] arr) {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                min=arr[i];
                break;
            }
        }
        return min;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna