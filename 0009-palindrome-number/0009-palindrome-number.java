class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int org=x;
        if(x<0) return false;
        while(x!=0){
            int remain=x%10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return false;
            }
            sum=sum*10+remain;
            x=x/10;
        }
        if(sum==org){
            return true;
        }
        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna