import java.util.Scanner;
public class FindNumber {
//
//    DECLARE num :INTEGER
//    DECLARE a: INTEGER
//    DECLARE d: INTEGER
//    DECLARE found : BOOLEAN
//    READ num
//            READ d
//    SET found :=FALSE
//
//    WHILE num>0
//    a:=num MOD 10
//    IF a==d THEN found:=TRUE
//    BREAK
//            END IF
//                    num :=num DIV 10
//    END WHILE
//            IF found == TRUE THEN
//            PRINT "PRESENT"
//    ELSE
//    PRINT "NOT PRESENT"
//    END IF

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, a, d;
            boolean found = false;
            System.out.print("Enter number: ");
            num = sc.nextInt();
            System.out.print("Enter digit to search: ");
            d = sc.nextInt();
            while (num > 0) {
                a = num % 10;
                if (a == d) {
                    found = true;break;
                }
                num = num / 10;
            }
            if (found == true) {
                System.out.println("PRESENT");
            } else {
                System.out.println("NOT PRESENT");
            }
        }
}
