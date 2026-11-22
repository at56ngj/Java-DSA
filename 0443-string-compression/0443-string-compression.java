class Solution {
    public int compress(char[] chars) {
        String str="";
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int count=0;
            int j=i;
            while(j<chars.length && chars[j]==ch){
                count++;
                j++;
            }
            str=str+ch;
            if(count>1){
                str=str+count;
            }
            i=j-1;
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna