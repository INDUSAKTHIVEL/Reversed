package Reversearray;
import java.util.Arrays;


public class Reversed {

    public static void reverseArrayRange(int[] A, int B, int C) {
        if (B < 0 || C >= A.length || B > C) {
            return;  
        }

        
        for (int i = B, j = C; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] A1 = {1, 2, 3, 4};
        int B1 = 2;
        int C1 = 3;
        reverseArrayRange(A1, B1, C1);
        System.out.println(Arrays.toString(A1));  
        // Test case 2
        int[] A2 = {2, 5, 6};
        int B2 = 0;
        int C2 = 2;
        reverseArrayRange(A2, B2, C2);
        System.out.println(Arrays.toString(A2));  
    }
}