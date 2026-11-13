package DSA.HashSet;

import java.util.*;

public class HashSets {
    public static void main(String[] args) {

        //Syntax Declare and Initialize :
        Set<String> names = new HashSet<>();

        names.add("Niyamat");
        System.out.println(names);
        //** Clear/Delete All from Set :
        names.clear();
        System.out.println(names);

        // Adding into HashSet :
        names.add("Niyamat");
        names.add("Ramess");
        names.add("Mahemud");
        names.add("Genda");
        names.add("Om");

        // Display Set using Printiing statement :
        System.out.println(names);

        // Size of Set :
        System.out.println(names.size());

        // Contains Method : return true or false
        System.out.println(names.contains("Niyamat"));
        System.out.println(names.containsAll(names));

        // isEmpty Method
        System.out.println(names.isEmpty());

        // Iterate Set :
        for (String a : names) {
            System.out.print(a+" ");
        }
        // OR
        names.forEach(System.out::println);

        // USING addAll Method :
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);

        Set<Integer> numSet = new HashSet<>();
        numSet.addAll(list);

        System.out.println(list);
        System.out.println(numSet);

        // TreeSet :
        // Keeps the Structure of the Tree :
        // if Printed ... returns in sorted order :
        Set<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(9);
        System.out.println(tree);


        // LinkedHashSet :
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(1);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(5);
        linkedSet.add(9);
        System.out.println(linkedSet);

    }
}
