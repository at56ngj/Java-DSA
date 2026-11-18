class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,t.charAt(i));
            }else{
               if(map.get(ch) != t.charAt(i)){
                return false;
               }
            }
        }
    HashMap <Character, Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=t.charAt(i);
            if(!map2.containsKey(ch)){
                map2.put(ch,s.charAt(i));
            }else{
               if(map2.get(ch) != s.charAt(i)){
                return false;
               }
            }
        }
        
        return true;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna