package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class StringBuild {
    public static void main(String[] args) {
        // String objects are stored in "String Pool" which is Present in "Heap Memory"
        // Strings are immutable, i.e. Once We Create a String, We cannot Modify it.

        // Here, We Created a reference Variable 'name' and assigned it as "Niyamat" and
        // printed it
        // then we again assigned "Barote" to it, then we printed it, what actually
        // happened ..!!
        // I said we cannot modify String then how did I 'changed' it ?
        // ans--> No, I didnt changed it, actaully gave other value to the object.
        // Here, we didn't changed the value of name but assigned other value in 'name'
        // And that 'Niyamat' value will be Managed by "Garbage Collection" system

        String name = "Niyamat";
        System.out.println(name);
        name = "Barote";
        System.out.println(name);

        // Camparing Strings:
        String a = "Ajaz";
        String b = "Ajaz";

        System.out.println(a == b); // Here, "Ajaz" is assigned to both a & b, the same value is present in the a &
                                    // b, This is because Strings are immutable and we cannot Modify it
        // Lets Understand it with an example :-

        String k = "Niyamat";
        String g = "Niyamat Barote";
        System.out.println(k == g);

        // Here we didnt modified the String 'k' but assigned another value to the 'g'
        // Note* Here (==) is comparator, it is used to check it that variable 'k' & 'g'
        // is idndicating to the same object or not that's why it is false and it is
        // true for 'a' & 'b'

        // here, (%s, %f,) are placeholders
        float s = 4.1234f;
        float as = 4.99999999f;
        System.out.printf("Value of s is: %f", s);
        System.out.printf("\nPie %.2f", s);
        System.out.printf("\nRound Fugure %.2f", as);
        System.out.printf("\nPIE %.3f", Math.PI);
        System.out.printf("\nHello I'm %s and i'm %s", "Niyamat", "Happy");

        // Other placeholders in JAVA:
        // %c - Character
        // %d - Decimal number (base 10)
        // %e - Exponential floating-point number
        // %f - Floating-point number
        // %i - Integer (base 10)
        // %o - Octal number (base 8)
        // %s - String
        // %u - Unsigned decimal (integer) number
        // %x - Hexadecimal number (base 16)
        // %t - Date/time
        // %n - Newline

        // String Oerators:-
        System.out.println("a" + "b");
        System.out.println('a' + 'b'); // It Considers the ASCII Value of 'a' & 'b'
        System.out.println('a' + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 3);
        // Note* when an integer is Concatinated(Added) with a String, It is converted
        // to its wrapper class Integer
        // 'int' will be converted into 'Integer' that will call 'toString()'
        // This is same as after some steps --> "a" + "3"
        System.out.println("Niyamat" + new ArrayList<>());
        System.out.println("Niyamat" + new Integer(45));
        System.out.println((char) ('a' + 25));
        System.out.println((char) ('a' + 25 - 2));

        // String Performance
        String ll = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            ll += ch;
        }
        System.out.println(ll);

        String str = new String("OOmmiya");
        String str1 = new String("OOmmiya");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        // This method of craeting the string creates new object for each variable

        // StringBuilder :- StringBuilder is MUTABLE
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char chra = (char) ('a' + i);
            stb.append(chra); // Use append
        }
        System.out.println(stb.toString());
        stb.append("Niyamat");
        System.out.println(stb);
        System.out.println(stb.capacity()); // shows num of chars
        System.out.println(stb.indexOf("Niyamat")); // Prints index
        System.out.println(stb.reverse());
        stb.deleteCharAt(0);
        stb.delete(0, 9);
        System.out.println(stb);
        System.out.println(stb.isEmpty());
        System.out.println(stb.length());
        stb.replace(0, 2, "NIY");
        System.out.println(stb);

        // String Methods
        String aa = "Niyamat Barote";
        System.out.println(aa.hashCode());
        System.out.println(aa.charAt(5));
        System.out.println(aa.codePointAt(0));
        System.out.println(aa.contains(str));
        System.out.println(aa.length());
        System.out.println(aa.toUpperCase());
        System.out.println(aa.toLowerCase());
        System.out.println(aa.compareTo(str1));
        System.out.println(aa.isBlank());
        System.out.println(aa.isBlank());
        System.out.println("        Hiiii      ".strip());
        System.out.println(Arrays.toString(aa.split("")));
        System.out.println(Arrays.toString(aa.split(" ")));
        

    }
}
