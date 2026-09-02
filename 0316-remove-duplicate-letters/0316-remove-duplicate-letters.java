class Solution {
    public String removeDuplicateLetters(String s) {
        char arr[]=s.toCharArray();
        int last[]=new int[26];
        for(int i=0;i<s.length();i++){
            last[arr[i]-'a']=i;
        }
        boolean bool[]=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=arr[i];
            if(bool[ch-'a']){
                continue;
            }
            while(!stack.isEmpty() && stack.peek()>ch && last[stack.peek()-'a']>i){
                bool[stack.peek()-'a']=false; 
               stack.pop();
            }
             stack.push(ch);
                bool[ch-'a']=true;

        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);

        }
        return sb.toString();

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna