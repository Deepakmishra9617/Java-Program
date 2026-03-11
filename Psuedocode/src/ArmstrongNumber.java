import java.util.*;
public class ArmstrongNumber {
//    DECLARE num : INTEGER
//    DECLARE a : INTEGER
//    DECLARE b : INTEGER
//    DECLARE n : INTEGER
//    SET b :=0
//    READ num
//            n:= num
//    WHILE num>0
//    a:= num MOD 10
//    b:= b+a*a*a
//    num := num DIV 10
//    END WHILE
//            IF b==n THEN
//            PRINT "ARMSTRONG"
//    ELSE
//    PRINT "NOT ARMSTRONG"
//    END IF

        public static void main(String[] args) {
            int num;
            int a;
            int b = 0;
            int n;

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number: ");
            num = sc.nextInt();

            n = num;

            while(num > 0)
            {
                a = num % 10;
                b = b + a*a*a;
                num = num / 10;
            }

            if(b == n)
            {
                System.out.println("ARMSTRONG");
            }
            else
            {
                System.out.println("NOT ARMSTRONG");
            }

        }
}

