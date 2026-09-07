class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
          Stack<Integer> stack=new Stack<>();
          int j=0;
          for(int num:pushed){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
          }
          return stack.isEmpty();
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna