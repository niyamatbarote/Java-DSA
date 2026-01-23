package DSA.Recursion;

import java.util.ArrayList;

public class Recursion_Arrays {
    
    static boolean isSorted(int[] arr, int index) {
        // Base Case:
        if (index == arr.length-1) {
            return true;
        }
        // Recursive Step:
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }

    static int search(int[] arr, int target, int index) {
        // Not Found Case :
        if (index >= arr.length) {
            return -1;
        }
        // Base Case :
        if (arr[index] == target) {
            return index;
        }
        // Recursive Formulae :
        return search(arr,target,index+1);
    }

    // To Print Multiple Occurences in an Array
    static ArrayList<Integer> ans = new ArrayList<>();
    static ArrayList<Integer> searchMultiple(int[] arr, int target, int index) {

        if (index >= arr.length) {
            return ans;
        }
        if (arr[index]==target){
            ans.add(index);
        }
        // Repetitive Part :
        return searchMultiple(arr,target,index+1);
    }

    // Other Method of searchMultiple :
    static ArrayList<Integer> searchMultiple1(int[] arr, int target, int index, ArrayList<Integer> ans) {

        if (index >= arr.length) {
            return ans;
        }
        if (arr[index]==target){
            ans.add(index);
        }
        // Repetitive Part :
        return searchMultiple1(arr,target,index+1, ans);
    }

    public static void main(String[] args) {

        int[] arr = {7,7,7,7,7,7};

//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(searchMultiple1(arr,7,0,ans));
    }


}
