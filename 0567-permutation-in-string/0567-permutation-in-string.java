class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char [] s1arr=s1.toCharArray();
        Arrays.sort(s1arr);
        String str1=new String(s1arr);
        int n=s1.length();
        for(int i=0;i<=s2.length()-n;i++){
            String sub=s2.substring(i,i+n);
            char ch[]=sub.toCharArray();
            Arrays.sort(ch);
            String str2=new String(ch);

            if(str1.equals(str2)){
                return true;
            }
        }
        return false;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna