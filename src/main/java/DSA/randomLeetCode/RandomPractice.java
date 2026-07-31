package DSA.randomLeetCode;

import java.util.ArrayList;
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
        if (low >= high) {
            return arr;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start ++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            //SWAP
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sortArray(arr,low, end);
        sortArray(arr,start, high);

        return arr;
    }

    public static ArrayList<Integer> removeElement(int[] arr, int val) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        // put array int list :
        for (int i = 0 ; i<n; i++ ) {
            list.add(arr[i]);
        }
        // Remove the VAL from Arraylist.
        for (int j = 0; j<list.size(); j++) {
            if (list.get(j) == val) {
                list.remove(j);
                j--;
            }
        }
        return list;
    }



    public static void main(String[] args) {
        int[] array = {7,9,2,4,5,1,3,4,9,5,4};
        int[] arr = {60};
        int n = array.length;

        System.out.println(removeElement(array, 7));
        ArrayList<Integer> list = new ArrayList<>();
        list = removeElement(array, 1);
        System.out.println(list);
        list.set(4,100);
        System.out.println(list);





    }
}
