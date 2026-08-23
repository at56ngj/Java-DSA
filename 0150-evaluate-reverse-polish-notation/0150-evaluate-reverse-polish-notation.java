class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        
        for(String token:tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                int num1=stack.pop();
                int num2=stack.pop();
                int result=0;
                if(token.equals("+")){
                    result=num1+num2;
                }else if(token.equals("-")){
                    result=num2-num1;
                }else if(token.equals("*")){
                    result=num1*num2;
                }else if(token.equals("/")){
                    result=num2/num1;
                }

                stack.push(result);
            }else{
                 stack.push(Integer.parseInt(token));
            }
           
        }
        return stack.pop();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna