package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // PUT Method: put(key,value)
        map.put(1,"Niyamat");
        map.put(2,"Pranav");
        map.put(3,"Vimal");
        map.put(4,"Rushi");
        map.put(5,"Om");
        map.put(6,"Krishh");

        // Printing HashMap
        System.out.println(map);

        // Get Method get(key) : returns value
        String  name = map.get(1);
        System.out.println(name);

        // Printing Whole HashMap
        for (Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e);
        }

        // containsKey Method: map.containsKey(key)
        // --> returns true if key present else false
        System.out.println(map.containsKey(90));

        // containsValue Method: map.containsValue(value)
        // --> returns true if value present else false
        // * For String it uses '.equals' method for comparison
        // * cases matters in Strings
        System.out.println(map.containsValue("Niyamat"));

        // get : map.get(key) : returns value
        System.out.println(map.get(4));
        System.out.println(map.get(1));




    }
}
