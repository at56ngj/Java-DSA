class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest=strs[0];
        for(int i=0;i<strs.length;i++){
            if(shortest.length()>strs[i].length()){
                shortest=strs[i];
            }
        }
        for(int i=0;i<shortest.length();i++){
            char ch=shortest.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return shortest.substring(0,i);
                }
            }
        }
        return shortest;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna