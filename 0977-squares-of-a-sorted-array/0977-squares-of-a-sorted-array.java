import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] =new int[nums.length];
        int a=0;
        for(int num:nums){
            int sq=num*num;
            arr[a]=sq;
            a++;
        }
        Arrays.sort(arr);
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna