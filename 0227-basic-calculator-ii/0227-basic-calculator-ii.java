class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int num = 0;
        char prevOp = '+';

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == arr.length - 1) {
                if (prevOp == '+') {
                    stack.push(num);
                } else if (prevOp == '-') {
                    stack.push(-num);
                } else if (prevOp == '*') {
                    stack.push(stack.pop() * num);
                } else if (prevOp == '/') {
                    stack.push(stack.pop() / num);
                }
                prevOp = ch;
                num = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna