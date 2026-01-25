package DSA.sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr) {
        // Base Case:
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left,right);

    }

    static int[] mergeArray(int[] first, int[] second) {

        int[] ans = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<first.length && j<second.length) {
            if (first[i] > second[j]) {
                ans[k] = second[j];
                j++;
            }else {
                ans[k] = first[i];
                i++;
            }
            k++;
        }
        // IN CASE if first OR second Arrays is Greater than each other
        // To check First Array have some remaining integers in it
        while (i<first.length) {
            ans[k] = first[i];
            k++;
            i++;
        }
        // To check Second Array have some remaining integers in it
        while (j<second.length) {
            ans[k] = second[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,4,3,5,6,2,3,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
