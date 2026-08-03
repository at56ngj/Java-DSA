class Solution {
    public boolean checkStraightLine(int[][] c) {
        int n=c.length;
        int dx=c[1][0]-c[0][0];
        int dy=c[1][1]-c[0][1];
        for(int k=2;k<n;k++){
            int dx_=c[k][0]-c[0][0];
            int dy_=c[k][1]-c[0][1];
            if(dy*dx_!=dy_*dx){
                return false;
            }
        } 
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna