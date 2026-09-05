class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (int i = 0; i < parts.length; i++) {

            String curr = parts[i];

            if (curr.equals("") || curr.equals(".")) {
                continue;
            }

            if (curr.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                stack.push(curr);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            ans.append("/");
            ans.append(stack.get(i));
        }

        if (ans.length() == 0) {
            return "/";
        }

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna