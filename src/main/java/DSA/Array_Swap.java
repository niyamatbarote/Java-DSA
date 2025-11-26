package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Swap {

    // Method to Swap the Elements in an Array :-
    static void swap (int[] arr, int IndexA, int IndexB){
        int temp = arr[IndexA];
        arr[IndexA]=arr[IndexB];
        arr[IndexB]=temp;
    }

    // Method to Get MAX FRom An Array:-
    static void getMax(int[] lisy){
        int max= 0;
        for (int i = 0; i < lisy.length; i++) {
            if (max<lisy[i]) {
                max = lisy[i];
            }
        }
        System.out.println("The Max From This Array is:  "+ max);
    }

    // Method to get MIN From an Array:-
    static void getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum From This Arrya is: "+min);
    }

    // Method to Reverse an Array:-
    static void reverseArray(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Reverse USing Swapping Method:-
    static void revSwap(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,9,3,7,5,10,4,9};
        swap(arr, 0, 4);
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        
        getMax(arr);

// ===========================================================================================================//

        // Program to Reverse an Array:-


        // Getting Lenght of an array:
        // System.out.println("Enter the length of an Array: ");
        // int n = sc.nextInt();

        // int[] myArray = new int[n];
        
        // // Input in Array:-
        // System.out.println("Enter "+n+ " Elements in Array: ");
        // for (int i = 0; i < myArray.length; i++) {
        //     myArray[i]=sc.nextInt();
        // }
        
        // // Printing Array:-
        // System.out.println("Your Array Is: "+Arrays.toString(myArray));

        // // Reversing Array:-
        // System.out.println("Reversed Array Would Be: ");
        // for (int i = n-1; i >= 0; i--) {
        //     System.out.print(+myArray[i]+" ");
        // }

// ==============================================================================================================

        getMax(arr);
        getMin(arr);
        reverseArray(arr);
        reverseArray(arr);
        revSwap(arr);
    }
}
