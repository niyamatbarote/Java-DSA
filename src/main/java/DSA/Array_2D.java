package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //SYNTAX :-
        // int[][] arrD = new int[3][];     // Valid Syntax

        // int[][] arrDe = {
        //     {23, 32, 55},           // 0th Index --> arr2D[0]=[23, 32, 55]
        //     {87, 48},               // 1st index
        //     {56, 43, 88, 67, 48}    // 2nd index
        // };

        int[][] arr = new int[3][3];

        System.out.println(arr.length);

        // Input in Array:-
        for (int row = 0; row < arr.length; row++) {
            // for Each Column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //Output for Array :- 

        // for (int row = 0; row < arr.length; row++) {
        //     for(int col = 0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col]+ " ");

        //     }
        //     System.out.println();
        // }

        // OR

        for(int i = 0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // OR
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
            
        }


    }
}
