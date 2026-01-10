package DSA.sorting;

import java.util.Arrays;

public class CyclicSort {

    static int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    // WRONG METHOD OF Doing Cyclic Sort :-
    // static int[] cyclicSort(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int num = arr[i] - 1;
    // if (arr[i] != arr[num]) {
    // swap(arr, i, num);
    // }
    // }
    // return arr;
    // }

    // NOT FOR DUPLICATE VALUES (Only UNIQUE)
    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctedIndex = arr[i] - 1;
            if (arr[i] != arr[correctedIndex]) {
                swap(arr, i, correctedIndex);
            }else{  
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 7, 3, 8, 2, 9, 1 };
        int[] array = { 3, 5, 2, 1, 4, 4, 4 };

        System.out.println(Arrays.toString(cyclicSort(arr)));
        System.out.println(Arrays.toString(cyclicSort(array)));
    }
}
