class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //pehle transpose nikalenge.
        //now, [0][0] wala value toh wahin rahega na, wo thodi kahin change hoga, tranpose karne se.. si, i=0 and j=i+1 i.e: [0][1] se swap karna chalu karenge.
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Now reverse the rows.
        //Row reverse matlab us row ke elements ka order ulta kar dena: [1,2,3] → [3,2,1].

    //Ye hum two pointers se karte hain, ek left se aur ek right se, aur dono ko swap karte
    for(int i=0;i<n;i++){
     int left=0;
     int right=n-1;
     while(left<right){
        //see, as same row ko hi rotate kar rahe hein, so matrix[i] const rakho
        int temp=matrix[i][left];
        matrix[i][left]=matrix[i][right];
        matrix[i][right]=temp;
        left++;
        right--;

     }
    }


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna