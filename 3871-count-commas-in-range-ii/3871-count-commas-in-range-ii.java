class Solution {
    public long countCommas(long n) {
        long ans=0;
         if (n >= 1_000L){
            ans+=(n-999L);
         } if(n>=1_000_000L){
            ans+=(n-999_999L);
         } if(n>=1_000_000_000L){
            ans+=(n-999_999_999L);
         } if(n>=1_000_000_000_000L){
            ans+=(n-999_999_999_999L);
         } if(n>=1_000_000_000_000_000L){
            ans+=(n-999_999_999_999_999L);
         }
         return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna