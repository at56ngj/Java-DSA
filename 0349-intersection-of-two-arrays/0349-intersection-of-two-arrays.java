import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set=new HashSet<>();
        int arr[]=new int[Math.max(nums1.length,nums2.length)];
        int a=0;
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                arr[a]=nums2[j];
                a++;
                set.remove(nums2[j]);
            }
            else{
                continue;
            }
        }
        return Arrays.copyOf(arr,a);
        
    }
}