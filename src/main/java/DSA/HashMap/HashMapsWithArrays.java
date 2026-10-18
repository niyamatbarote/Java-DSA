package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapsWithArrays {
    public static void main(String[] args) {

        //*** Number --> Frequency map1
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] arr1 = {3,4,5,6,7,6,5,4,3,2,4,5,4};

        //*** Number --> Frequency map1
        for (int val : arr1) {
            // getOrDefault(key, defaultValue) if key exists returns ' value of that key '
            // else returns the defaultValue
            map1.put(val , map1.getOrDefault(val , 0) + 1);
        }
        // map1.getOrDefault(key , defaultValue);
        System.out.println("frequency of 2 : "+map1.getOrDefault(2,0));
        System.out.println("frequency of 3 : "+map1.getOrDefault(3,0));
        System.out.println("frequency of 4 : "+map1.getOrDefault(4,0));
        System.out.println("frequency of 5 : "+map1.getOrDefault(5,0));
        System.out.println("frequency of 6 : "+map1.getOrDefault(6,0));
        System.out.println("frequency of 7 : "+map1.getOrDefault(7,0));

        System.out.println(map1);

        // putIfAbsent(key, value)  METHDO: --> Puts key value pair Only if ABSENT in HashMap
        map1.putIfAbsent(1,0);
        map1.putIfAbsent(8,0);
        map1.putIfAbsent(4,10);

        // This is a method to access all key-value pairs in a HashMap
        for (Map.Entry<Integer, Integer> e : map1.entrySet()){
            System.out.print(e+" ");
        }

        // remove(key) Method --> Used to delete Key-Value pair
        map1.remove(1);
        map1.remove(8);

        for (Map.Entry<Integer,Integer> e : map1.entrySet()){
            System.out.println(e+" ");
        }

        // size() Method
        System.out.println("Size of HashMap is : "+map1.size());


        //*** Index --> Value map2
        

    }
}
