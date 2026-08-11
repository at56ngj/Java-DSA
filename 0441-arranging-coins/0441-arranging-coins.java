class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            n=n-i;
            count++;
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna