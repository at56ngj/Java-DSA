class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1; // 1 = +, -1 = -

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            } 
            else if(c == '+'){
                result += sign * number;
                number = 0;
                sign = 1;
            } 
            else if(c == '-'){
                result += sign * number;
                number = 0;
                sign = -1;
            } 
            else if(c == '('){
                // current result aur sign save karo, fresh start karo
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } 
            else if(c == ')'){
                result += sign * number;
                number = 0;
                result *= stack.pop(); // saved sign
                result += stack.pop(); // saved result
            }
        }

        return result + sign * number;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna