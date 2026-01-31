package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

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

    static ArrayList<String> subSequences1(String processed, String unProcessed) {
        // Base Case:
        if (unProcessed.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        char ch = unProcessed.charAt(0);

        // Recursive Step :
        // This will INCLUDE the Character
        ArrayList<String> left = subSequences1(processed+ch, unProcessed.substring(1));
        // This Will SKIP That Character
        ArrayList<String> right = subSequences1(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
//        OR
//        right.addAll(left);
//        return right;
    }

    // Void Return Type :
    static void subSeqAscii(String p, String up) {
        // Base Case :
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Recursive Part :
        char ch = up.charAt(0);

        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p+(ch+0),up.substring(1));
    }

    // ArrayList Return Type :
    static ArrayList<String> subSeqAsciiRet(String p, String up) {
        // Base Case :
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        // Recursive Part :
        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAsciiRet(p,up.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p+ch,up.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p+(ch+0),up.substring(1));

        // Merge All first, second , And Third
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    static List<List<Integer>> subSet(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
    return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSet(arr));

    }
}
