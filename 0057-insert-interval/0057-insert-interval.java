class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // jo poori tarah newinterval se pehle khatam ho gaye
        while (i < n && intervals[i][1] < newinterval[0]) {
            list.add(intervals[i]);
            i++;
        }

        int start = newinterval[0];
        int end = newinterval[1];
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        list.add(new int[]{start, end});

        while (i < n) {
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna