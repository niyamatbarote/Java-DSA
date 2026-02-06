package DSA.sorting;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr, int low , int high) {
        // Base Case :
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/ 2;
        // PIVOT Selection (Here we selected Middle element as a Pivot)
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            // SWAP :
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // Till Here We have made the pivot at Correct Index
        // It's time to sort the LHS & RHS of Pivot
        // As the start & end breaks the WHILE LOOP Bcz Start > End
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }

    // With a Return Type Array :
    static int[] quickSortRet(int[] arr, int low , int high) {
        // Base Case :
        if (low >= high) {
            return arr;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/ 2;
        // PIVOT Selection (Here we selected Middle element as a Pivot)
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            // SWAP :
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // Till Here We have made the pivot at Correct Index
        // It's time to sort the LHS & RHS of Pivot
        // As the start & end breaks the WHILE LOOP Bcz Start > End
        quickSortRet(arr,low,end);
        quickSortRet(arr,start,high);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,3,1,7,8,4,7,1,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        int[] aray = {6,5,4,3,7,1};
//        Arrays.sort(aray);
//        System.out.println(Arrays.toString(aray));

        // With A new return type
        int[] newAns = quickSortRet(arr,0,arr.length-1);
        System.out.println(Arrays.toString(newAns));
    }
}
