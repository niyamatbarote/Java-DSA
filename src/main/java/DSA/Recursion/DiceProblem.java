package DSA.Recursion;

import java.util.ArrayList;

import static DSA.Recursion.Recursion_Arrays.ans;

public class DiceProblem {

    public static void dice (String processed, int target) {
        // Base Case :
        if (target == 0) {
            System.out.println(processed);
            return;
        }

        // Recursive Part :
        for (int i = 1; i <= 6 && i<= target; i++) {
            dice(processed+i,target-i);
        }
    }

    public static ArrayList<String> diceReturn(String processed, int target) {
        // Base Case :
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        ArrayList<String> answer = new ArrayList<>();
        // Recursive Part :
        for (int i = 1; i <= 6 && i<= target; i++) {
            answer.addAll(diceReturn(processed+i,target-i));
        }
        return answer;

    }

    public static void main(String[] args) {
        dice("",4);
//        System.out.println(diceReturn("",4));
    }
}
