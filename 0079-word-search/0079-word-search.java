class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //i		Abhi kaunsi row par ho
                //j		Abhi kaunsi column par ho
                //0	idx	Word ka kaunsa letter match karna hai (0 = pehla letter)
                //0 se shurur kar do, rest letter wo fucntion match karke true/false bhej dega.
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    

public boolean dfs(char[][] board, String word, int i, int j, int idx){
    // Agar idx word ki length ke barabar ho gaya,
        // matlab saare letters match ho chuke hain
        if (idx == word.length()) {
            return true;
        }
        //i<0, kahin row left side ke bahar  chala gaya..then false;
        //j<0, kahin col upar side ke bahar chala gaya..then false;
        //i>=board.length, row , row length se bahar, neeche bahar chala gaya  then false
        //j>=borad[0].length, col right side bahar hi chala gaya, col.length ke bahar, then false.
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != word.charAt(idx)) {
            return false;
        }
        char temp = board[i][j];  // original letter save karo (backtrack ke liye)
        board[i][j] = '#';        // visited mark karo, is path mein dobara use na ho

        // 4 directions mein aage badho, koi ek bhi true de to kaafi hai
        boolean found = dfs(board, word, i + 1, j, idx + 1)    // neeche
                     || dfs(board, word, i - 1, j, idx + 1)    // upar
                     || dfs(board, word, i, j + 1, idx + 1)    // right
                     || dfs(board, word, i, j - 1, idx + 1);   // left

        board[i][j] = temp;  // BACKTRACK: original letter wapas rakh do
                             // taaki dusre paths is cell ko use kar sakein
    return found;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna