import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(n>1){
            Arrays.sort(stones,0,n);
            if(stones[n-1]==stones[n-2]){
                n=n-2;
                continue;
            }
            else{
               
                stones[n-2]=stones[n-1]-stones[n-2];
                n=n-1;
            }


        }
        if(n==1){
            return stones[0];
        }
      
        return 0;
       
        
        

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna