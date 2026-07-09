class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
           int index=-1;
           for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                index=j;
                break;
            }
           }
           
        
        ans[i]=-1;
        for(int p=index+1;p<nums2.length;p++){
            if(nums2[index]<nums2[p]){
                ans[i]=nums2[p];
                break;
            }
        }

        }
        return ans;
        
    }
}