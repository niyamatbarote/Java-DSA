package DSA;

import java.util.Arrays;

public class InsertionSort {

    static int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j-1, j);
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 5, 4, 8, 3, 9, 2, 1 };

        System.out.println(Arrays.toString(insertionSort(arr)));

    }
}
