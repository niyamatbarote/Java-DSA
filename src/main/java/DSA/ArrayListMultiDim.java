package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMultiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Declaration :-
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Input:-
        System.out.println("Enter In Multidimensional array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        //Output:- 
        System.out.println(list);       // MultiDimensional ArrayList Can be Declared using "println"








    }
}
