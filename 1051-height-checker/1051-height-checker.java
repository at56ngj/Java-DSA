import java.util.*;
class Solution {
    public int heightChecker(int[] arr) {
        int arr2[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr2[i]!=arr[i]){
                count++;
            }
            else{
                continue;
            }
        }
        return count;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna