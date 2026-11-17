class Solution {
    public int reverse(int x) {
        long num=0;
        while(x>0){
                int rev=x%10;
                 num=num*10+rev;
                    x=x/10; 
        }
        if (num > Integer.MAX_VALUE) {         // check the reversed number
            return 0;
        }
        if(x<0){
                x=-x;
                long ans=0;
                while(x>0){
                     int rev=x%10;
                ans=ans*10+rev;
                 x=x/10;

                }
                 if(-ans <Integer.MIN_VALUE){
            return 0;
        }
                return (int)-ans;
               
            }
       

        return (int) num;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna