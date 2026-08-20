class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str=new StringBuilder();
        Stack <Character> stack=new Stack<>();
        int i=0;
        char ch[]=s.toCharArray();
        while(i<ch.length){
            if((stack.isEmpty() || stack.peek()!=ch[i])){
                 stack.push(ch[i]);
            str.append(ch[i]);
            i++;
            }
            else{
                stack.pop();
                str.deleteCharAt(str.length()-1);
                i++;
            }
           
        }
        return str.toString();

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna