class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
       for(int num:set){
        if(!set.contains(num-1)){
            int cnt=1;
            int currentnum=num;

            while(set.contains(currentnum+1)){
                currentnum++;
                cnt++;
            }
            count=Math.max(count,cnt);

        }
        
       }
       return count;
    }
}