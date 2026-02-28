package DSA.randomLeetCode;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,5,3,2,9};
    }
}
