import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int left=0;
        Arrays.sort(strs);
        String ans="";
        String first=strs[0];
        String last=strs[strs.length-1];
        while(left<first.length() && left<last.length() && first.charAt(left)==last.charAt(left)){
            ans=ans+strs[0].charAt(left);
            left++;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna