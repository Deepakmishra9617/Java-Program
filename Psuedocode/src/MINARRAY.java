import java.util.Scanner;
public class MINARRAY {

//    DECLARE  a: ARRAY [10]OF INTEGER
//            DECLARE min :INTEGER
//    FOR i:=0 TO 4
//    READ a[i]
//    END FOR
//            SET MIN:=a[0]
//    FOR i:=0 TO 4
//    IF a[i]<min THEN
//    min := a[i]
//    END IF
//            END FOR
//                    PRINT min

  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] a = new int[10];
            int min;
            for(int i = 0; i <= 4; i++)
            {
                System.out.print("Enter element: ");
                a[i] = sc.nextInt();
            }
            min = a[0];
            for(int i = 0; i <= 4; i++)
            {
                if(a[i] < min)
                {
                    min = a[i];
                }}
            System.out.println("Minimum element = " + min);
        }}

