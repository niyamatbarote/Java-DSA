package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class z {

    static int findTarget(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    class Solution {
        public int search(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;
            int ans = -1;

            while (start <= end ) {
                int mid = start + (end - start)/2;

                if (arr[mid] == target) {
                    ans = mid;
                }
                if (arr[start] <= arr[mid]) { //Left Sorted Check (If Present b/w Start & Mid)
                    if (target >= arr[start] && target <= arr[mid] ) {
                        end = mid -1;
                    }else {
                        start = mid+1;
                    }
                } else {//Right Sorted Check (If Present b/w Mid & End)
                    if (target >= arr[mid] && target <= arr[end] ) {
                        start = mid +1;
                    }else {
                        end = mid -1;
                    }
                }
            }
            return ans;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,43,64,65,6,5,3,2,1,56};
        int x = findTarget(arr, 2);
        System.out.println(x);

    }
}
