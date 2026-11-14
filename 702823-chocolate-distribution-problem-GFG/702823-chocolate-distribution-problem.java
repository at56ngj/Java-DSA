import java.util.*;
class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        int n=arr.length;
        if(m==0 || n<m){
            return 0;
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0; i+m-1<n;i++){
            int diff=arr[i+m-1]-arr[i];
            min=Math.min(min,diff);
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna