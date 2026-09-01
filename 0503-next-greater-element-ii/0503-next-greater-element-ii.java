class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            int index=i%nums.length;
            while(!stack.isEmpty() && nums[index]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[index]=-1;
            }else{
                arr[index]=stack.peek();
            }
            stack.push(nums[index]);
        }
        return arr;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna