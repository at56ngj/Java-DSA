import java.util.Arrays;
class Solution {
    public long gcdSum(int[] nums) {
        int mxi=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mxi = Math.max(mxi, nums[i]);   
            arr[i]=gcd(nums[i],mxi); 
        }
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        long gcd=0;
        long sum=0;
        while(left<right){
            if(left==right){
                break;
            }
            gcd=gcd(arr[left],arr[right]);
            sum=sum+gcd;
            left++;
            right--;
        }
        return sum;
        
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    // public int max(int[] arr,int k){
    //     //int arr1[]=new int[arr.length];
    //     int max=arr[0];
    //     for(int i=1;i<=k;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }


}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna