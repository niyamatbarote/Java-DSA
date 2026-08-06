package DSA.randomLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    // LC Q)66 PLUS ONE
    public static int[] plusOne(int[] arr) {
        int n = arr.length;

        for (int i=n-1; i>=0; i--) {
            // if arr[i] is LESS THAN 9 then there will be NO CARRY
            if (arr[i]<9) {
                arr[i]++;
                // It will return array if there is number like 129 / 859 etc
                return arr;
            }

            arr[i] = 0;
        }
        // If we get out of the FOR LOOP means the number is LIKE 9 / 99 / 999 like on
        // Means we need to create a NEW ARRAY with n+1 SIZE;
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }

    // LC Q) 989 TestCase [9,9,9,9,9,9,9,9,9,9] & [1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3]
    public static List<Integer> addToArray(int[] arr, int k) {
        // let the Number in array be 'num'
        long num = 0;
        // Get Number from the array :
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        long totSum = num+k;
        // Create a List for answer:
        List<Long> list = new ArrayList<>();
        // Put the totSum in the arrayList;
        // we Need to FETCH the LAST DIGIT From Number & SET It at INDEX 0:
        while (totSum>0) {
            list.addFirst(totSum%10);
            totSum /= 10;
        }
        List<Integer> ans = new ArrayList<>();
        for (Long numb : list) {
            ans.add(numb.intValue());
        }
        return ans;
        
    }

    public static List<Integer> findMissingElements(int[] arr) {
        int[] sorted = sortArray(arr,0,arr.length-1);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<sorted.length-1; i++) {
            int diff = 1;
            if (arr[i+1] - arr[i] != 1) {
                diff = arr[i+1] - arr[i];
            }
            // For Incrementing the missing+1
            // eg [1,5] diff = 4, 1+1, 1+2, 1+3
            int j = 1;
            while (diff > 1) {
                list.add(arr[i] + j);
                j++;
                diff--;
            }
        }

        return list;
    }

    // LC Q) 1281
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n>0) {
            int last = n%10;
            sum += last;
            prod *= last;
            n/=10;
        }
        return prod-sum;
    }

    // Test case for Q)989
    //[1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3]

    public static void main(String[] args) {
        int[] array = {7,9,2,4};
        int[] arr = {60};
        int n = array.length;
        System.out.println(findMissingElements(array));

    }
}
