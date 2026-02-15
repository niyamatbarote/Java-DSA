package DSA.Backtracking;


import java.util.ArrayList;


public class N_Queens {

    // **** TIME COMPLEXITY OF N-QUEEN PROBLEM IS  ::: O(N!) ****

    // helper function :
    public static ArrayList<String> construct(String[][] board) {
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            // Joins the row array ["Q", ".", ".", "."] into a single string "Q..."
            String joint = String.join("",board[i]);
            ans.add(joint);
        }
        return ans;
    }

    // IS SAFE CHECK :
    public static boolean isSafe(String[][] board, int row, int col,int n) {

        // Horizontal Check :
        for (int i = 0; i < n ; i++) {
            if ("Q".equals(board[row][i])) {
                return false;
            }
        }

        // Horizontal Check :
        for (int j = 0; j < n ; j++) {
            if ("Q".equals(board[j][col])) {
                return false;
            }
        }

        // Left Diagonal Check :
        for (int i=row, j=col;   i>=0 && j>=0;   i--,j--) {
            if ("Q".equals(board[i][j])) {
                return false;
            }
        }

        // Right Diagonal Check :
        for (int i=row, j=col;   i>=0 && j<n;   i--,j++ ) {
            if ("Q".equals(board[i][j])) {
                return false;
            }
        }
    return true;
    }

    // PLACING QUEENS ACCORDING TO THE ROWS ...
    public static void nQueens(String[][] board, int row, int n, ArrayList<ArrayList<String>> ans) {
        // Base Case :
        if (row == n) {
            ans.add(construct(board));
//            System.out.println(ans);
            return;
        }

        // Check For Next Row :
        for (int i = 0; i < n ; i++) {
            if (isSafe(board,row,i,n)) {
                board[row][i] = "Q";
                nQueens(board,row+1,n,ans);
                // Backtracking if This is Wrong Decision :
                board[row][i] = ".";
            }
        }
    }

    public static void main(String[] args) {

        int n= 4;
        String[][] board = new String[n][n];

        // Making the 2D ArrayList with "."
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }

        // ... (your board initialization) ...
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        nQueens(board, 0, n, ans);

        // Print at the very end to see all unique solutions found
        for (ArrayList<String> solution : ans) {
            System.out.println(solution);
        }
    }

}
