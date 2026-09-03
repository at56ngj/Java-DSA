class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else{
              if(open>0 && ch==')'){
                open--;
              }else{
                close++;
              }
            }
        }
        return open+close;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna