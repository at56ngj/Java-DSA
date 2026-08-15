class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        return pq.peek();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna