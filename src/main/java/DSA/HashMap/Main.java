package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"Niyamat");
        map.put(2,"Pranav");
        map.put(3,"Vimal");
        map.put(4,"Rushi");
        map.put(5,"Om");
        map.put(6,"Krishh");

        System.out.println(map);

        String  name = map.get(1);
        System.out.println(name);

        for (Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e);
        }
    }
}
