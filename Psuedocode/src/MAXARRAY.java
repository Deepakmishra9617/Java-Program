import java.util.Scanner;
public class MAXARRAY {
//    DECLARE a:ARRAY [5] OF INTEGER
//            DECLARE maX : INTEGER
//    FOR i:=0 TO 4
//    READ a[i]
//    END FOR
//            SET MAX :=a[0]
//    FOR i:=0 TO 4
//    IF a[i] >max THEN
//            max := a[i]
//    END IF
//            END FOR
//                    PRINT max
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] a = new int[5];
            int max;
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter element: ");
                a[i] = sc.nextInt();
            }
            max = a[0];
            for (int i = 0; i < 5; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println("Maximum element = " + max);}
}
