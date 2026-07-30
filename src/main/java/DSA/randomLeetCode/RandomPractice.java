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

    // Q) 4 Median of two sorted arrays :
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int i =0;
        int j =0;
        int k =0;

        int[] ans = new int[a1+a2];

        while (i < a1 && j < a2) {

            if ( arr1[i] > arr2[j] ) {
                ans[k] = arr2[j];
                k++;
                j++;
            } else {
                ans[k] = arr1[i];
                k++;
                i++;
            }
        }

        while (i<a1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j<a2) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        int n = ans.length;
        double median = 0.0;

        if (n%2 != 0) {
            median = ans[(n-1)/2];
        }
        else   {
            median = (double) (ans[n / 2] + ans[n / 2 - 1]) / 2;
        }

        return median;
    }

    public static int[] sortArray(int[] arr, int low, int high) {
        if (low >= high){
            return arr;
        }
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start) / 2;
        int pivot = arr[mid];

        while (start < end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            //SWAP
            if (start >= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sortArray(arr,low,end);
        sortArray(arr,start,high);

        return arr;
    }



    public static void main(String[] args) {
        int[] array = {1,2,5,6,2,1};
        int[] arr = {60};
        int n = array.length;
        int[] ans = sortArray(array, 0, n);
        System.out.println(Arrays.toString(ans));




    }
}
