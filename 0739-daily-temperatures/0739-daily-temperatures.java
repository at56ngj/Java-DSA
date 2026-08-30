class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int result[]=new int[temp.length];
        Stack <Integer> stack=new Stack<>();
        //ye stack index save kar raha hai.
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int idx=stack.pop();
                result[idx]=i-idx;
            }
            stack.push(i);

        }
        return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna