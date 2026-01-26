package DSA.sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr) {
        // Base Case:
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        // It excludes the to: value Like it excludes "mid" for "left"
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

    // In Place Merge Sort :-
    // This is More Optimized as we are not passing the Copy of the Array Without Taking Extra Space
    static void inPlaceMergeSort(int[]arr, int start , int end) {
        if (end - start == 1) { // NOTE ***
            return;
        }
        int mid = (start+end) / 2;

        inPlaceMergeSort(arr,start,mid);
        inPlaceMergeSort(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i<mid && j<end) {
            if (arr[i] > arr[j]) {
                ans[k] = arr[j];
                j++;
            }else {
                ans[k] = arr[i];
                i++;
            }
            k++;
        }
        // IN CASE if first OR second Arrays is Greater than each other
        // To check First Array have some remaining integers in it
        while (i<mid) {
            ans[k] = arr[i];
            k++;
            i++;
        }
        // To check Second Array have some remaining integers in it
        while (j<end) {
            ans[k] = arr[j];
            k++;
            j++;
        }
        System.arraycopy(ans, 0, arr, start + 0, ans.length);
    }

    public static void main(String[] args) {
        int[] arr = {7,8,9,4,3,5,6,2,3,1};
        inPlaceMergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
