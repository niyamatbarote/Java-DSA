package DSA;

import java.util.Arrays;
import java.util.Scanner;    
public class Array {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] str = {2,4,5,3,7};
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));           
    }
    static void change(int[] arr){
        arr[0]=44;
    }
}
