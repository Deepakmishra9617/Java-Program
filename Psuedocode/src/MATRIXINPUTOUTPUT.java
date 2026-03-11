import java.util.Scanner;
public class MATRIXINPUTOUTPUT {
//    DECLARE  x: ARRAY [2][2] OF INTEGER
//            FOR r:= 0 TO 1
//    FOR c := 0 TO 1
//    READ x [r][c]
//    END FOR
//            END FOR
//                    FOR r:= 0 TO 1
//    FOR c:= 0 TO 1
//    PRINT x[r][c]
//    END FOR
//        END FOR


public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x[][] = new int[2][2];
            int r, c;
            System.out.println("Enter elements of matrix:");
            for (r = 0; r < 2; r++) {
                for (c = 0; c < 2; c++) {
                    x[r][c] = sc.nextInt();
                }}
            System.out.println("Matrix is:");
            for (r = 0; r < 2; r++) {
                for (c = 0; c < 2; c++) {
                    System.out.print(x[r][c] + " ");
                }
                System.out.println();}
        }}


