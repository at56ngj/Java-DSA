class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n==1){
            return 1;
        }
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int count=0;
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                
                for(int k=0;k<n;k++){
                    int dx_=points[k][0]-points[j][0];
                    int dy_=points[k][1]-points[j][1];
                    if(dy*dx_==dy_*dx){
                        count++;
                    }
                }
                result=Math.max(count,result);
            }
        }
        return result;
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna