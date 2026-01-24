package DSA.Recursion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Recursion_Pattern_Sorting {

    static void starPattern(int r) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // starPattern Using Recursion :
    static void starPattern01(int r, int c) {
        // Base Case:
        if (r == 0) {
            return;
        }
        // Recursive Part :
        if (r>c) {
            starPattern01(r, c+1);
            System.out.print("* ");
            // It is Printing when it's coming out of the STACK

        }else {
            starPattern01(r-1,0);
            System.out.println();
            // It is Printing when it's comig out of the STACK
        }
    }

    static void starPattern1(int r) {
        for (int i = 0; i <= r; i++) {
            for (int j = r; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // starPattern1 Using Recursion
    static void starPattern12(int r, int c) {
        // Base Case:
        if (r == 0) {
            return;
        }
        // Recursive Part
        if (r>c) {
            System.out.print("* ");
            starPattern12(r,c+1);
            // It is Printing when it's Being Put in the STACK
        }else {
            System.out.println();
            starPattern12(r-1,0);
            // It is Printing when it's Being put in the STACK
        }
    }

    static int[] swap(int[] arr, int one , int two ) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
        return arr;
    }

    static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;
    }


    // Bubble Sort Using Recursion
    // Here (length = arr.length) and (start = 0)
    static void recBubbleSort(int[] arr, int length, int start) {
        // Base Case :
        if (length == 0) {
            return ;
        }
        // Recursive Steps :
        if (start < length) {
            if (arr[start] > arr[start+1]) {
                swap(arr, start, start+1);
            }
            recBubbleSort(arr,length,start+1);
        }else {
            recBubbleSort(arr, length - 1, 0);
        }
    }

    // Selection Sort Using Recursion (Not Workinnnnn)
    static void recSelectionSort(int[] arr, int start, int end) {
        if (end == 0) {
            return;
        }
        int max = getMax(arr);
        if (start < end) {
            if (arr[start] > arr[max]) {
                swap(arr,max,start);
            }
            recSelectionSort(arr,start+1, end);
        }else {
            recSelectionSort(arr,end-1,start);
        }
    }


    public static void main(String[] args) {

        int[] arr = {5,6,4,7,3,8,2,10,1,9};
        recSelectionSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
