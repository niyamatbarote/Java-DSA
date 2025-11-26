package DSA;

public class Maths {

    // This condition checks the last digit in the binary number and hence it
    // decides if it is odd or not
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // To Find The Unique Element from an Arrya, where all the other elements in
    // that array are duplicatess
    public static int findUnique(int[] arr) {
        int unique = 0;

        for (int elements : arr) {
            unique ^= elements;
        }
        return unique;
    }

    // Find the Nth Bit of a No.
    public static int findNBit(int n, int i) {
        return n & (1 << i - 1);
    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 3, 4, -2, 1, 3 };

        System.out.println(isOdd(55));
        System.out.println(isOdd(20));
        System.out.println(findUnique(arr));
        System.out.println(findNBit(10, 1));

    }
}
