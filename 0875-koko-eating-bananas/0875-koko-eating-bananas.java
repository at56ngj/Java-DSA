class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;//min banans in 1 hr.
        int right = 0;//max bananas in 1 hr.
        for (int num : piles) {
            right = Math.max(num, right);
        }
        //now rightis the max element.and that is max bananas in 1 hr,
        while (left < right) {
            int mid = (left + right) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours = hours + (pile + mid - 1) / mid;//formula for getting ceiling element.
                //Example: pile = 7, mid = 3 (speed)

                //Actual me kitne ghante chahiye? 3 khaye (1 ghanta), 3 khaye (2 ghanta), 1 bacha (3 ghanta) → 3 ghante
                //Normal 7/3 = 2 (galat, kyunki floor ho gaya)
                //Trick wala: (7+3-1)/3 = 9/3 = 3 ✅ sahi
            }
            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna