package DSA.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPath {

    // THIS PROGRAM WILL GIVE THE STACKOVERFLOWERROR BCOZ AS IT IS BEING IN LOOP OF UP DOWN & LEFT RIGHT
    // All Directions Included UP,DOWN,LEFT,RIGHT:
    static void mazeUPRL(String p,boolean[][] arr, int r, int c) {
        // Base Case :
        if (r == arr.length-1 && c == arr[0].length-1 ) {
            System.out.println(p);
            return;
        }
        // Obstacle/Stone Condition (False)
        if (!arr[r][c]) { // OR (arr[r][c] == false)
            return;
        }
        // DOWN
        if (r < arr.length-1) {
            mazeUPRL(p+'D',arr,r+1,c);
        }
        // RIGHT
        if (c < arr.length-1) {
            mazeUPRL(p+'R',arr,r,c+1);
        }
        // UP
        if (r>0) {
            mazeUPRL(p+'U',arr,r-1,c);
        }
        // LEFT
        if (c > 0) {
            mazeUPRL(p+'L',arr,r,c-1);
        }
    }

    // The Drawback of Above Code is Found out in this Code
    // All Directions Included UP,DOWN,LEFT,RIGHT:
    static void mazeUPRL1(String p,boolean[][] arr, int r, int c) {
        // Base Case :
        if (r == arr.length-1 && c == arr[0].length-1 ) {
            System.out.println(p);
            return;
        }
        // Obstacle/Stone Condition (False)
        if (!arr[r][c]) { // OR (arr[r][c] == false)
            return;
        }
        // I'm considering this cell/block in my path (i.e. Making This Block FALSE)
        arr[r][c] = false; // ********************
        // DOWN
        if (r < arr.length-1) {
            mazeUPRL1(p+'D',arr,r+1,c);
        }
        // RIGHT
        if (c < arr.length-1) {
            mazeUPRL1(p+'R',arr,r,c+1);
        }
        // UP
        if (r>0) {
            mazeUPRL1(p+'U',arr,r-1,c);
        }
        // LEFT
        if (c > 0) {
            mazeUPRL1(p+'L',arr,r,c-1);
        }

        // This Line is Where the FUNCTION GETS OVER :
        // so, before the function gets removed, also remove the changes that we made in that function (UNDO)
        // Backtrack //
        arr[r][c] = true;   // *****************************
    }

    // With Returning in arrayList :
    static ArrayList<String> mazeUPRLRet(String p, boolean[][] arr, int r, int c) {
        // Base Case :
        if (r == arr.length-1 && c == arr[0].length-1 ) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        // Obstacle/Stone Condition (False)
        if (!arr[r][c]) { // OR (arr[r][c] == false)
            return list;
        }
        // Marking This Path as False :
        arr[r][c] = false;
        // DOWN
        if (r < arr.length-1) {
            list.addAll(mazeUPRLRet(p+'D',arr,r+1,c));
        }
        // RIGHT
        if (c < arr.length-1) {
            list.addAll(mazeUPRLRet(p+'R',arr,r,c+1));
        }
        // UP
        if (r>0) {
            list.addAll(mazeUPRLRet(p+'U',arr,r-1,c));
        }
        // LEFT
        if (c > 0) {
            list.addAll(mazeUPRLRet(p+'L',arr,r,c-1));
        }
        // REVERTING the Changes which we made while we were in PATH (UNDO)
        arr[r][c] = true;

        return list;
    }

    // *** MOST INTERESTING AND FUN CODE *** //
    static void mazeAllPath(String p,boolean[][] arr, int r, int c,int[][] path,int step) {
        // Base Case :
        if (r == arr.length-1 && c == arr[0].length-1 ) {
            // This is Also a Step :
            path[r][c] = step;
            for(int[] array : path) {
                System.out.println(Arrays.toString(array));
            }
            System.out.println(p);
            // Leave a Line //
            System.out.println();
            return;
        }
        // Obstacle/Stone Condition (False)
        if (!arr[r][c]) { // OR (arr[r][c] == false)
            return;
        }
        // I'm considering this cell/block in my path (i.e. Making This Block FALSE)
        arr[r][c] = false; // ********************
        // Step assigning
        path[r][c] = step; // ********************
        // DOWN
        if (r < arr.length-1) {
            mazeAllPath(p+'D',arr,r+1,c,path,step+1);
        }
        // RIGHT
        if (c < arr.length-1) {
            mazeAllPath(p+'R',arr,r,c+1,path,step+1);
        }
        // UP
        if (r>0) {
            mazeAllPath(p+'U',arr,r-1,c,path,step+1);
        }
        // LEFT
        if (c > 0) {
            mazeAllPath(p+'L',arr,r,c-1,path,step+1);
        }

        // This Line is Where the FUNCTION GETS OVER :
        // so, before the function gets removed, also remove the changes that we made in that function (UNDO)
        // Backtrack //
        arr[r][c] = true;   // *****************************
        // UNDO The steps For Next Recursion Calls
        path[r][c] = 0;  // *****************************
    }

    public static void main(String[] args) {
        boolean[][] obstacle = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[obstacle.length][obstacle[0].length];

//        System.out.println(mazeUPRLRet("",obstacle,0,0));
//        mazeUPRL1("",obstacle,0,0);

        // *** MOST INTERESTING AND FUN CODE *** //
        mazeAllPath("",obstacle,0,0,path,1);


    }
}
