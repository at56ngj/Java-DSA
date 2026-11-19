class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ArrayList<int[]>list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<=end){
                 end=Math.max(e,end);

            }else{
                list.add(new int[] {start,end});
                start=s;
                end=e;
            }
        }
        list.add(new int[]{start,end});
        return  list.toArray(new int[list.size()][]);
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna