package DSA;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your String: ");
        String str = sc.nextLine();
        str=str.toLowerCase();  // check..
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = false;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                isPalindrome = true;
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("This is The Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
