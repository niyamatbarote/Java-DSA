package DSA;

import java.util.Arrays;
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

    public int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

    public int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j-1]>arr[j]) {
                    swap(arr,j-1,j);
                }
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,43,64,65,6,5,3,2,1,56};

    }
}
