class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        int arr2[]=new int[nums2.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums2[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr2[i]=-1;
            }else{
                arr2[i]=stack.peek();//ans ko array main daalo
            }
             stack.push(nums2[i]);//current ko stack main  push karo
        }
      
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                arr[i]=arr2[j];
                break;
            }
        }
      }
      return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna