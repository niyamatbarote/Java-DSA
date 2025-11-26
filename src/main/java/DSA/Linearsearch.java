package DSA;

import java.util.Arrays;

public class Linearsearch {

    static int linearSearch(int[] arr, int target){
        
        if (arr==null) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target) {
                return index;
            }
        }
        return -1;

    }

    // Searching in String
    static boolean searchStr(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true ;
            }
        }

        return false;

    }

    // Using For Each Loop:-
    static boolean searchStr2(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (char element : str.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
         return false;
    }

    // Search in Range:-
    static void searchRange(int[] arr,int target, int start, int end){
        boolean found = false;
        if (arr.length == 0) {
            System.out.println("Null Array");
        }

        for (int i = start; i <= end; i++) {
            if (arr[i]==target) {
                System.out.println("Target Found at Index: "+i);
                found=true;
            }
        }
        if (!found) {
                System.out.println("Target Not Found");  
            }
    }

    // Searching MINIMUM in Range:-
    static void minSearch(int[] arr, int start, int end){
        int min=Integer.MAX_VALUE;

        if (arr.length==0) {
            System.out.println("Null Array.!!");
        }

        for (int i = start; i <= end; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in Range "+start+" to "+end+" is: "+min);
    }
    
    // Searching MINIMUM in Range:-
    static void maxSearch(int[] arr, int start, int end){
        int min=Integer.MIN_VALUE;

        if (arr.length==0) {
            System.out.println("Null Array.!!");
        }

        for (int i = start; i <= end; i++) {
            if (arr[i]>min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in Range "+start+" to "+end+" is: "+min);
    }

    // Searching in 2D Array:-
    static int[] searchArray(int[][] arr, int target){
        if (arr.length== 0) {
            return new int[]{-1,-1};
        }

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c]==target) {
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        
        int[] arr = {4,2,32,54,56,23,67,86,45,43,23,12};
        int [][] array= new int[][] {
            {3,5,7,1},
            {7,54,34},
            {43,97,54,64,23,20},
            {98,57}
        };
        String str = "Niyamat";


        // System.out.println("The Target is at Index: "+linearSearch(arr, 86));
        // System.out.println(searchStr(str, 'y'));
        // System.out.println(searchStr2(str, 'a'));
        // System.out.println(Arrays.toString(str.toCharArray()));
        // searchRange(arr, 25, 1, 5);
        // minSearch(arr, 5, 10);
        // maxSearch(arr, 5, 10);

        // Searching in 2D Array:-
        int[] ans = searchArray(array, 54); 
        System.out.println(Arrays.toString(ans));


    }
}
