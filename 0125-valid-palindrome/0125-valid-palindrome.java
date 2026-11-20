class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char ch=s.charAt(left);
            char chh=s.charAt(right);
            if(!Character.isLetterOrDigit(ch)){
                left++;
            }else if(!Character.isLetterOrDigit(chh)){
                right--;
            }else{
                char c=Character.toLowerCase(ch);
                char cc=Character.toLowerCase(chh);
                if(c!=cc){
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna