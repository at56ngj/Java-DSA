class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        long low=1, high=x;
        int ans=1;

        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
                ans=(int)mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna