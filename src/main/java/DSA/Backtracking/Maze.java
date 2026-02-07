package DSA.Backtracking;

import java.util.ArrayList;

public class Maze {


    // NOTE **********************************************************
//    WE ARE SOLVING THIS FOR A MAZE AS : EG = 3X3
//    3  2  1
//    2
//    1

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

    // moving only DOWN or RIGHT
    public static void mazeMoves(String processed, int row, int column) {
        // Base Case :
        if (row == 1 && column == 1) {
            System.out.println(processed);
            return;
        }

        // Recursive Step :
        if (row > 1) {
            mazeMoves(processed+'D',row-1,column);
        }
        if (column > 1) {
            mazeMoves(processed+'R',row,column-1);
        }
    }

    // moving only DOWN or RIGHT
    // With Return Type
    public static ArrayList<String> mazeMovesRet(String processed, int row, int column) {
        // Base Case :
        if (row == 1 && column == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        // Recursive Step :
        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(mazeMovesRet(processed+'D',row-1,column));
        }
        if (column > 1) {
            list.addAll(mazeMovesRet(processed+'R',row,column-1));
        }
        return list;
    }

    // moving only DOWN or RIGHT or DIAGONAL
    static int mazeAllSteps(int row, int col) {
        // Base Case :
        if (row == 1 || col == 1) {
            return 1;
        }
        // Recursive Steps :
        int down = mazeAllSteps(row-1, col);
        int right = mazeAllSteps(row,col-1);
        int horiz = mazeAllSteps(row-1,col-1);

        return down+right+horiz;
    }

    // moving only DOWN or RIGHT or DIAGONAL
    static void mazeAllMoves(String processed, int row , int col) {
        // Base Case :
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        // Recursive Steps :
        // D -> Diagonal, H -> Horizontal ( -- ), V -> Vertical ( | )
        // For Row Check (Down Move)
        if (row > 1) {
            mazeAllMoves(processed+'V', row-1,col);
        }
        // For Col Check (Right Move)
        if (col > 1) {
            mazeAllMoves(processed+'H', row,col-1);
        }
        // For Row & Col Check (Diagonal Move)
        if (row > 1 && row >1) {
            mazeAllMoves(processed+'D', row-1,col-1);
        }
    }

    // moving only DOWN or RIGHT or DIAGONAL
    public static ArrayList<String> mazeAllMovesRet(String processed, int row, int col) {
        // Base Case :
        if (row == 1 && col== 1) {
            ArrayList<String > ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        // Recursive Step :
        ArrayList<String > list = new ArrayList<>();
        // D -> Diagonal, H -> Horizontal ( -- ), V -> Vertical ( | )
        if (row > 1) {
            list.addAll(mazeAllMovesRet(processed+'V',row-1,col));
        }
        if (col > 1) {
            list.addAll(mazeAllMovesRet(processed+'H',row,col-1));
        }
        if (col > 1 && row > 1) {
            list.addAll(mazeAllMovesRet(processed+'D',row-1,col-1));
        }

        return list;
    }

    // ONLY RIGHT AND DOWN DIRECTION
    // Start At (0,0) and Target AT (n,n)
    static void mazeObstacle(String path, boolean[][] maze, int row, int col) {
        // Base Case:
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        // RECURSION PART :
        // | OR | if (obs.[row][col] == false)
        if (!maze[row][col]) {
            return;
        }
        // GO DOWN :
        if (row < maze.length-1) {
            mazeObstacle(path+'D',maze,row+1,col);
        }
        // GO RIGHT ( col + 1 )
        if (col < maze[0].length-1) {
            mazeObstacle(path+'R',maze,row,col+1);
        }

    }

    // ONLY RIGHT AND DOWN DIRECTION
    // Start At (0,0) and Target AT (n,n)
    static ArrayList<String> mazeObstacleRet(String path, boolean[][] maze, int row, int col) {
        // Base Case:
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(path);
            return ans;
        }
        // RECURSION PART :
        ArrayList<String> list = new ArrayList<>();
        // | OR | if (obs.[row][col] == false)
        if (!maze[row][col]) {
            return list;
        }
        // GO DOWN :
        if (row < maze.length-1) {
            list.addAll(mazeObstacleRet(path+'D',maze,row+1,col));
        }
        // GO RIGHT ( col + 1 )
        if (col < maze[0].length-1) {
            list.addAll(mazeObstacleRet(path+'R',maze,row,col+1));
        }
    return list;
    }

    public static void main(String[] args) {
//        System.out.println(mazeStepsCount(4,4));
//        mazeMoves("",4,4);
//        System.out.println(mazeMovesRet("",4,4));

//        System.out.println(mazeAllSteps(3,3));
//        mazeAllMoves("",3,3);
//        System.out.println(mazeAllMovesRet("",3,3));

        // HERE, FALSE IS THE OBSTACLE :
        boolean[][] obstacle = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
            };

        System.out.println(mazeObstacleRet("",obstacle,0,0));
    }
}
