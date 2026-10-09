class Solution {
    private int rows, cols, wordLen;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        wordLen = word.length();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == word.charAt(0) && dfs(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col, int idx) {
        if (row < 0 || col < 0 || row >= rows || col >= cols
                || board[row][col] != word.charAt(idx)) {
            return false;
        }

        if (idx == wordLen - 1) {
            return true;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = dfs(board, word, row, col + 1, idx + 1)
                     || dfs(board, word, row + 1, col, idx + 1)
                     || dfs(board, word, row, col - 1, idx + 1)
                     || dfs(board, word, row - 1, col, idx + 1);

        board[row][col] = temp;

        return found;
    }
}