package DSA;

public class Arrays_Dynamic {
    public static void main(String[] args) {
        
        // Dynamic Array :-
        int[][] arr = {
            {23, 43, 55},
            {32, 12},
            {21, 23, 43, 53}
        };

        // Output of Array :- 
        for(int r=0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
