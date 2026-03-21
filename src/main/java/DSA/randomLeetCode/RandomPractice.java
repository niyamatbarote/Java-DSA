package DSA.randomLeetCode;

import java.util.Arrays;

public class RandomPractice {

    // Swap Elements :
    public static int[] swap(int[] arr, int start, int end ) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

// Reverse an array :
    public static int[] rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }

    // Median of two sorted arrays :
    public int[] findMedianSortedArrays(int[] arr1, int[] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int i =0;
        int j =0;
        int k =0;

        int[] ans = new int[a1+a2];

        while (i < a1 || j < a2) {

            if ( arr1[i] > arr2[j] ) {
                ans[k] = arr2[j];
                k++;
                j++;
            } else {
                ans[k] = arr1[i];
                k++;
                i++;
            }

            while (i<a1) {
                ans[k] = arr1[i];
                i++;
                k++;
            }

            while (j<a2) {
                ans[k] = arr1[j];
                j++;
                k++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arrray = {10,20,30,40,50};
        int[] arr = {60,70};




    }
}
