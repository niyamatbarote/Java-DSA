package DSA;

import java.util.Arrays;

public class SelectionSort {
    static int[] swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return arr;
    }

    static int getMax(int[] arr, int start, int end) {  // finding max in range
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxItemIndex = getMax(arr, 0, lastIndex);
            swap(arr, maxItemIndex, lastIndex);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 7, 3, 8, 2, 9, 1, 56, 34, 23, 65, 76, 23,1 };

        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}
