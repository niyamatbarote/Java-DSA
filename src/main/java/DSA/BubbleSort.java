package DSA;

import java.util.Arrays;

public class BubbleSort {
    static int[] swap(int[] arr, int el1, int el2) {
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = temp;
        // System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int[] bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) { // OR if(swapped == false) , Note:- !false == True
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 6, 2, 7, 1, 8 };

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
