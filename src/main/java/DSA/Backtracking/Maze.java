package DSA.Backtracking;

public class Maze {

    // How many different ways you can reach from top-left to bottom-right
    // moving only DOWN or RIGHT
    public static int mazeStepsCount(int row, int column) {
        // Base Case :
        if (row == 1 || column == 1) {
            return 1;
        }

        int left = mazeStepsCount(row-1,column);
        int right = mazeStepsCount(row, column-1);

        return left + right;
    }

    public static void main(String[] args) {
        System.out.println(mazeStepsCount(3,4));
    }
}
