class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Integer> stack=new Stack<>();
        //int count=0;
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            int n=ch-'0';
            
            while(!stack.isEmpty() && stack.peek()>n && k>0 ){
                stack.pop();
                k--;
            }
            stack.push(n);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for (int no : stack) {
            sb.append(no);
        }
       while(sb.length()>1 && sb.charAt(0)=='0'){
        sb.deleteCharAt(0);
       }
       if(sb.toString().equals("")){
        return "0";
       }
        return sb.toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna