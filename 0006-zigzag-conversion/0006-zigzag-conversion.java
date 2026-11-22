class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        // Step 1: har row ke liye ek khaali box banao
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Step 2: row number track karo
        int row = 0;
        int step = 1;   // +1 matlab neeche, -1 matlab upar

        // Step 3: har letter ko uski row mein daalo
        for (char c : s.toCharArray()) {
            rows[row].append(c);

            if (row == 0) step = 1;                 // top pe ho to neeche jao
            if (row == numRows - 1) step = -1;      // bottom pe ho to upar jao

            row = row + step;
        }

        // Step 4: sab rows ko jod do
        StringBuilder ans = new StringBuilder();
        for (StringBuilder r : rows) {
            ans.append(r);
        }
        return ans.toString();
    }

    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna