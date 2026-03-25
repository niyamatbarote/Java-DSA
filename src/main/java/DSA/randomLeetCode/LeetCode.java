package DSA.randomLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode {

    // ❌
    // LC 258
    // https://leetcode.com/problems/add-digits/
    static int addDigits(int num) {
        if (num == 0) {
            return 0 ;
        }
        int sum = 0;
        while (sum <10) {
            sum = num %= 10;
            sum += num %= 10;
            num /= 10;
            if (sum <10) {

                return sum;
            }else {
                sum = 0;
            }
        }
        return sum;
    }

    // ❌
    // LC Q) 27
    // https://leetcode.com/problems/remove-element/
    static int removeElements(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==val) {
                arr[i] = 0;
            }
        }
        return arr.length-1;
    }

    // LC Q) 1929
    // https://leetcode.com/problems/concatenation-of-array/description/
    static int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n+ n];
        int i= 0;   // index for arr
        int j= 0;   // index for ans

        while (i<n && j<n+n){
            ans[j] = arr[i];
            ans[j+n] = arr[i];
            j++;
            i++;
        }

        return ans;
    }

    // LC Q) 1470
    // https://leetcode.com/problems/shuffle-the-array/description/
    class Solution {
        public int[] shuffle(int[] arr, int n) {
            int l = arr.length;
            int[] arrx = new int[n];
            int[] arry = new int[n];
            int[] ans = new int[l];

            int i = 0;
            int j = n;
            while (i<n && j<l) {
                arrx[i] = arr[i];
                arry[i] = arr[j];
                i++;
                j++;
            }

            int a = 0;
            // int b= 0;
            int c = 0;
            while (a<n) {
                ans[c] = arrx[a];
                c++;
                ans[c] = arry[a];
                a++;
                // b++;
                c++;
            }
            return ans;
        }
    }

    // Q) 989  Add to Array Form of Integer :
    public static int digitCount(int n) {
        int count = 0;
        while (n>0) {
            n /= 10;
            count ++;
        }
        return count;
    }

    public static List<Integer> addToArrayForm(int[] arr, int k) {
        int n = arr.length;
        long integer = 0;

        for (int i = 0; i<n; i++) {
            integer = integer * 10 + arr[i];
        }
        integer += k;

        ArrayList<Integer> list = new ArrayList<>();
        int digit = digitCount((int)integer);
        int[] ans = new int[digit];
        for (int j = digit-1; j>=0; j--) {
            ans[j] = (int) integer % 10;
            integer /= 10;
        }

        for (int i = 0; i<digit; i++) {
            list.add(ans[i]);
        }
        return list;
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

    // Q) 3546
    public static int canPartitionGrid(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        boolean hor = false;
        boolean ver = false;

        int horSum = 0;
        int verSum = 0;
// horizontal Sum :
        for (int i =0 ; i<1; i++) {
            for(int j=0; j<col; j++) {
                horSum += arr[i][j];
            }
        }
// vertical Sum :
        int l = 0;
        int m = 0;
        while (l<row) {
            verSum += arr[l][m];
            l++;
        }

        for (int i =0 ; i<row; i++) {
            int sum = 0;
            for (int j = 0; j<col; j++) {
                sum += arr[i][j];
            }
            if (sum != verSum) {
                hor = false;
                break;
            } else {
                hor = true;
            }
        }

        for (int i =0; i<col; i++) {
            int tot=0;
            for (int j = 0; j<row; j++) {
                tot += arr[i][j];
            }
            if (tot != horSum) {
                hor = false;
                break;
            }else {
                hor = true;
            }
        }

        return verSum;


    }

    public static void main(String[] args) {
        int[][] arr = {{2,3},{1,4}};
        System.out.println(canPartitionGrid(arr));
        System.out.println();
    }
}
