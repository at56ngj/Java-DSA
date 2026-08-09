class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        if(n<3){
            return 0;
        }
        int count=0;
        for(int i=1;i<n-1;i++){
            //peak cheack, left se bada; and right se bada
            if(arr[i-1]<arr[i] && arr[i]> arr[i+1]){
                int left=i;
                int right=i;
                //abhi hum peak pe hein.
                while(left>0 && arr[left-1]<arr[left]){
                    left--; //left expand ho raha
                }
                while(right<n-1 && arr[right]>arr[right+1]){
                    right++;
                }
                 count=Math.max(count, right-left+1);

            }
           
        }
        return count;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna