package DSA;

import java.util.Arrays;

public class Binary_Search_LC {

    // Ceiling of a Number Problem (Using Binary Search)(Sorted Array):-

    static int ceilingNumber(int[] arr, int target) {

        // What if There is No Ceiling of a Number:-
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int exp = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
                // exp = mid; // Wrong..!!
            } else { // (target<arr[mid])
                end = mid - 1;
                exp = mid;
            }
        }
        return start;
    }

    // =============================================================================================

    // Floor of a Number (Sorted Array)(Binary Search):-

    static int floorNumber(int[] arr, int target) {

        // what if there is no floor Numbber (Optional)
        // if (target < arr[0]) {
        // return -1;
        // }

        int start = 0;
        int end = arr.length - 1;
        int exp = 0; // No need as we Are returning End
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
                // exp = mid; // Wrong..!!
            } else { // (target<arr[mid])
                end = mid - 1;
                exp = mid;
            }
        }
        return end;
    }

    // ===============================================================================

    // ================================================================================
    // Ceiling of a Number (Unsorted Array):-
    // static int ceilingNumber(int[] arr, int target) {
    // int ceiling = 0;

    // for (int i = 0; i < arr.length; i++) {
    // int sum = 0;
    // if (arr[i] == target) {
    // return i;
    // } else if (arr[i] > target) {
    // sum = i;
    // }

    // if (sum < arr[i]) {
    // ceiling = sum;
    // }
    // }
    // return ceiling;
    // }

    // 744. Find Smallest Letter Greater Than Target
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=vrww4tkr
    static char nextGreatChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

    // =====================================================================================================================

    // Q)34 First and Last Position of an Element in Sorted Array :-
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=problem-list-v2&envId=vrww4tkr
    static int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = leftMost(arr, target);
        ans[1] = rightMost(arr, target);
        return ans;
    }

    static int leftMost(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int rightMost(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                ans = mid;
                start = mid + 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // ==========================================================================================================================

    // Q) Amazon Interview Question :-
    // Find the element from an INFINITE SORTED ARRAY :-

    static int myAns(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // Double the box value
            // Formula :- end = end + ArraySize*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // =====================================================================================================

    // Q)162 PEAK INDEX
    // https://leetcode.com/problems/find-peak-element/?envType=problem-list-v2&envId=vrww4tkr

    static int findPeakElement(int[] arr) {
        // int peak = 0; no needed
        // int max = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // This is the Desc part of the array
                end = mid;
            } else { // (arr[mid]<arr[mid+1])
                // This is the Asc part of the array
                start = mid + 1;
            }
        }
        return start; // or return end;
    }

    // ===================================================================================================
    // Q) 1095--> Fiind in Mountain Array :-
    // https://leetcode.com/problems/find-in-mountain-array/description/?envType=problem-list-v2&envId=vrww4tkr
    // Note:- This is Brute Force Answer

    static int findInMountainArray(int[] arr, int target) {
        int left = leftTargInMount(arr, target);
        int right = rightTargInMount(arr, target);

        if (left != -1 && right != -1) {
            return Math.min(left, right);
        } else if (right != -1) {
            return right;
        } else {
            return left;
        }
    }

    static int leftTargInMount(int[] arr, int target) {
        int start = 0;
        int end = findPeakElement(arr);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                ans = mid;
                end = mid - 1; // go left for smaller index
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int rightTargInMount(int[] arr, int target) {
        int ans = -1;
        int peak = findPeakElement(arr);
        int end = arr.length - 1;
        while (peak <= end) {
            int mid = peak + (end - peak) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                ans = mid;
                end = mid - 1; // to find smallest index on right side
            } else {
                peak = mid + 1;
            }
        }
        return ans;
    }

    // ==========================================================================================================
    // Q) 33 Find in Rotated Sorted Array:-
    // https://leetcode.com/problems/search-in-rotated-sorted-array/?envType=problem-list-v2&envId=vrww4tkr
    // Its giving correct ANSWERS for duplicates in the array
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
            }

            if (arr[start] <= arr[mid]) { // left sorted check
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // right sorted check
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }

    // Q) Find the Rotation count in Rotated Sorted Array :-
    // Brute Force Answer (Using Linear Search)

    static int rotationCount(int[] arr) {
        int maxi = -1;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxi = i + 1;
            }
        }
        return maxi;
    }

    // Q) Find the Rotation count in Rotated Sorted Array :-
    // Optimized Answer (Using Binary Search) TC- O(logN)
    static int rotationCountBS(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (end > mid && arr[mid] > arr[mid + 1]) {
                ans = mid + 1;
            }
            if (start < mid && arr[mid - 1] > arr[mid]) {
                ans = mid;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // =========================================================================================
    // Q) Find the PIVOT in Rotated Sorted Array :-
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases Here:-
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // char[] arr1 = { 'c', 'f', 'j' };
        // int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 25, 30, 44, 90 };
        // Index----> 0, 1, 2, 3, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14
        // int[] arr2 = { 2, 4, 7, 7, 7, 7, 8, 8, 9 };
        // int[] mountain = { 10, 12, 20, 22, 30, 19, 15, 9, 5, 4, 2 };
        int[] rotated = { 60, 60, 70, 10, 15, 17, 20, 20, 30, 40, 40, 50 };
        int[] rotated1 = { 20, 20, 40, 50, 60, 70, 80, 90, 10 };

        // System.out.println(ceilingNumber(arr, 19));
        // System.out.println(findPeakElement(arr, 91));
        // System.out.println(floorNumber(arr, 1));
        // System.out.println(nextGreatChar(arr1, 'f'));
        // System.out.println(Arrays.toString(searchRange(arr2, 7)));
        // System.out.println(leftMost(arr2, 7));
        // System.out.println(rightMost(arr2, 7));
        // System.out.println(myAns(arr, 44));
        // System.out.println(findPeakElement(mountain));
        // System.out.println(findInMountainArray(mountain, 9));
        // System.out.println(search(rotated, 20));
        System.out.println(rotationCount(rotated1));
        System.out.println(rotationCountBS(rotated));
        // System.out.println(pivot(rotated));
    }
}
