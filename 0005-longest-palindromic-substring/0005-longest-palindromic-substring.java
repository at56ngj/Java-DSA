class Solution {
    public String longestPalindrome(String s) {
        String ans = "";   // ab tak ka sabse lamba palindrome

        // har starting index try karo
        for (int left = 0; left < s.length(); left++) {

            // har ending index try karo (peeche se)
            for (int m = s.length() - 1; m >= left; m--) {

                // pehle hi chhota hai to check karne ka fayda nahi
                if (m - left + 1 <= ans.length()) {
                    break;
                }

                if (s.charAt(m) == s.charAt(left)) {
                    int i = left;
                    int j = m;
                    boolean isPal = true;   // maan lo palindrome hai

                    while (i < j) {
                        if (s.charAt(i) != s.charAt(j)) {
                            isPal = false;  // mismatch, palindrome nahi
                            break;
                        }
                        i++;
                        j--;
                    }

                    if (isPal) {
                        ans = s.substring(left, m + 1);  // m include karna hai, to m + 1
                        break;   // is left ke liye sabse lamba mil gaya
                    }
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna