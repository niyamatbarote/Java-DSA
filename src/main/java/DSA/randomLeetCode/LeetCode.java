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

    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr,1));
    }
}
