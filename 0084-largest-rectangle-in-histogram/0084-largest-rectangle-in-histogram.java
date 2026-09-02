class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack <Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=stack.peek();
            }
            stack.push(i);
        }


        stack.clear();


        for(int i=n-1;i>=0;i--){
             while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i]=heights.length;
            }else{
                right[i]=stack.peek();
            }
            stack.push(i);
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int area=heights[i]* (right[i]-left[i]-1);
            ans=Math.max(area,ans);
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna