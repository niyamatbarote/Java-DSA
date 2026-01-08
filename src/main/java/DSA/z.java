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




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,43,64,65,6,5,3,2,1,56};
        int x = findTarget(arr, 2);
        System.out.println(x);
    }
}
