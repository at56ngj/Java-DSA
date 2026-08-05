class Solution {
    public boolean backspaceCompare(String s, String t) {
        String sb1=neww(s);
        String sb2=neww(t);
    
     return sb1.equals(sb2);

        
    }
    public String neww(String s){
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++ ){
            char c=s.charAt(i);
            if(c=='#'){
               if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else{
                sb.append(c);

            }

        }
        return sb.toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna