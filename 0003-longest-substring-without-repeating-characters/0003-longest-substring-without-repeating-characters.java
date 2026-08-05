class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int count=0;
        
        HashSet <Character> set=new HashSet<>();
        for(right=0;right<s.length();right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
           set.add(s.charAt(right));
            count=Math.max(count,right-left+1);
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna