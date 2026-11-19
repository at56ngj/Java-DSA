class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // left se right, top row
            for (int j = left; j <= right; j++) list.add(matrix[top][j]);
            top++;

            // top se bottom, right column
            for (int i = top; i <= bottom; i++) list.add(matrix[i][right]);
            right--;

            // right se left, bottom row (agar row bachi ho)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) list.add(matrix[bottom][j]);
                bottom--;
            }

            // bottom se top, left column (agar column bacha ho)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna