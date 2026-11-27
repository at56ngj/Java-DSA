class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set=new HashSet<>();
        int left=0;
        int best=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            best=Math.max(best,i-left+1);
        }
        return best;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna