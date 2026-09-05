import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> toRemove = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    toRemove.add(i);
                }
            }
        }

        // Any '(' left unmatched
        while (!stack.isEmpty()) {
            toRemove.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (!toRemove.contains(i)) {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna