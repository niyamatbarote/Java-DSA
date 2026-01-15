package DSA.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    // This Method is not optimized as it checks for i to n
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // This is the Best Optimized Way For Prime Nums Bcz:
    //            1 × 36
    //            2 × 18
    //            3 × 12
    //            4 × 9
    //            6 × 6   ← middle point (√n)

    public static boolean isPrimeOpt(int n) {

        if (n <= 1) {
            return false;
        }

        int c = 2;
//        c <= √n
//        c*c <= n
        while (c*c <= n) {
            if (n % c == 0) {
               return false;
            }
            c++;
        }
        return true;
    }

    public static List<Integer> primeNums(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 2 ; i < n; i++) {
            if (isPrimeOpt(i)==true ) {
                ans.add(i);
            }
        }
        return ans;
    }

    // if primes[i] is FALSE then it is a prime number
    static void sieve(int n , boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {   // if (primes[2] == false)
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {   // if (primes[2] == false)
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {

//        System.out.println(isPrimeOpt(113));
//        for (int i = 0; i < 20 ; i++) {
//            System.out.println(i + " is "+ isPrimeOpt(i));
//        }

//        System.out.println(primeNums(40));
        int n = 40;
        boolean[] prime = new boolean[n+1];
        sieve(n,prime);


    }


}
