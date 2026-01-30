package DSA.Recursion;

import java.util.ArrayList;

public class Subset_Subsequences_inString {

    static String skipChar(String ans, String str, char remove) {
        // Base Case :
        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);
        // Recursive Part :
        if (ch == remove) {
            // It will Keep the ans as it is && Move index Ahead by 1
            return skipChar(ans, str.substring(1),remove);
        }else {
            // It will add that Char to ans && Move Index Ahead by 1
            return skipChar(ans+ch, str.substring(1),remove);
        }
    }

    static String skipString(String str, String remove) {
        // Base Case :
        if (str.isEmpty()) {
            return "";
        }

        int length = remove.length();
        char ch = str.charAt(0);
        // Recursive Steps :
        if (str.startsWith(remove)) {
            return skipString(str.substring(length),remove);
        }else {
            return  ch+ skipString(str.substring(1),remove);
        }
    }
    static String skipAppNotApple(String str) {
        // Base Case :
        if (str.isEmpty()) {
            return "";
        }

        int length = 3;
        char ch = str.charAt(0);
        // Recursive Steps :
        if (str.startsWith("App") && !str.startsWith("Apple")) {
            return skipAppNotApple(str.substring(length));
        }else {
            return  ch+ skipAppNotApple(str.substring(1));
        }
    }

    static void subSequences(String processed, String unProcessed) {
        // Base Case:
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        // Recursive Step :
        // This will INCLUDE the Character
        subSequences(processed+ch, unProcessed.substring(1));
        // This Will SKIP That Character
        subSequences(processed, unProcessed.substring(1));
    }

    static ArrayList<String> subSequences1(String processed, String unProcessed, ArrayList<String> ans) {
        // Base Case:
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        // Recursive Step :
        // This will INCLUDE the Character
        subSequences1(processed+ch, unProcessed.substring(1),ans.add(1,ch));
        // This Will SKIP That Character
        subSequences1(processed, unProcessed.substring(1));
    }

    public static void main(String[] args) {
        String s = "abc";
        subSequences("",s);
    }
}
