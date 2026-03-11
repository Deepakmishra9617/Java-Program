import java.util.Scanner;
public class Factorial {
    //PSUEDOCODE
    // INTEGER I,NUM,FACT
  //  READ NUM
        //   SET FACT :=1
//    FOR I:=NUM TO 1 STEP -1
//    FACT := FACT*I
//    END FOR
//            PRINT FACT
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i, num;
            int fact = 1;
            System.out.print("Enter number: ");
            num = sc.nextInt();
            for(i = num; i >= 1; i--)
            {
                fact = fact * i;
            }
            System.out.println("Factorial = " + fact);
        }
    }
