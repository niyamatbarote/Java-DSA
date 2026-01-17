package DSA.Math;

import java.util.ArrayList;

public class Factors {

    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n%i ==0) {
                System.out.print(i+" ");
            }
        }
    }

    static void factors2(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                if (n/i == i) {
                    System.out.print(i+" ");
                }else {
                    System.out.print(i +" ");
                    ans.add(n/i);
                }
            }
        }
        for (int i = ans.size()-1; i >= 0 ; i--) {
            System.out.print(ans.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        factors2(100);
    }
}
