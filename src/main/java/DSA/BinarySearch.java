package DSA;

import java.util.Scanner;

public class BinarySearch {

    // Binary Search :-
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found :-
                return mid;
            }
        }
        // Target Not Found :-
        return -1;
    }

    // Binary Search FOr Descending Arrray:-
    static int binarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                // Answer :-
                return mid;
            }

        }
        // Target Not Found:-
        return -1;
    }

    // Order Agnostic Binary Search :-
    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If Target Found :-
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        // Target Not Found :-
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorted Array:-
        int[] arr = { 12, 14, 16, 18, 20, 23, 25, 27, 30, 32, 33, 35 };
        int[] arr1 = { 30, 29, 28, 27, 26, 20, 9, 8, 7, 6, 5, 4, };

        System.out.println(binarySearch(arr, 20));
        System.out.println(binarySearch1(arr1, 27));
        System.out.println(orderAgnosticBS(arr, 20));
        System.out.println(orderAgnosticBS(arr1, 27));
    }
}
