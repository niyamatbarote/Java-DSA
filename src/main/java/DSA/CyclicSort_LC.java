package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort_LC {

    // Program to SWAP Elements in an Array:
    static int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    // Amazon Interview Question (Leetcode Q) 258)
    // https://leetcode.com/problems/missing-number/
    static int findMissingNum(int[] arr) {
        // int ans = -1;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // (arr[i] < arr.length) this extra condition bcoz range[0,N]...... (Might Be)
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j; // returning Directly and not storing it, bcoz it maybe overwritten
            }
        }
        return arr.length;
    }

    // ===================================================================================================
    // Google Interview Question (LC Q) 448)
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    // Note:- if range --> [0,N] , then --> element will be at index = element
    // if range --> [1,N], then --> element will be at index = element - 1
    static List<Integer> findAllMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // check the Missing Number:-
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    // ===============================================================================================
    // Amazon Interview Que(Lc Q) 287)
    // https://leetcode.com/problems/find-the-duplicate-number/
    static int findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
                // return i;
            } else {
                i++;
            }
        }
        // Check for Duplicates
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }

    // Microsoft & Microsoft Que (LC Q) 442)
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/
    static List<Integer> findMultiDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Condition to Check The Duplicates
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    // Set Mismatch (LC Q) 645)
    // https://leetcode.com/problems/set-mismatch/
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // to check the set mismatch
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] { arr[j]/* Duplicates */, j + 1/* Missing Element */ };
            }
        }
        return new int[] { -1, -1 };
    }

    // Google Que (Hard) (LC Q) 41 ) Q) First Missing Positive
    // https://leetcode.com/problems/first-missing-positive/
    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // First Missing Positive Condition
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length - 1;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 0, 3, 4, 5, 6, 8, 1 };
        // int[] array = { 4, 5, 1, 6, 9, 7, 8 };
        // int[] duplicate = { 4, 5, 3, 2, 3, 1 };
        int[] errorSet = { 1, 6, 4, 3, 3, 2 };

        // System.out.println(findMissingNum(arr));
        // System.out.println(findDuplicates(duplicate));
        // System.out.println(findMultiDuplicates(duplicate));
        System.out.println(Arrays.toString(findErrorNums(errorSet)));
        System.out.println(firstMissingPositive(errorSet));
    }
}
