import java.util.Scanner;
public class Palindrome {
//    DECLARE num : INTEGER
//    DECLARE a : INTEGER
//    DECLARE b : INTEGER
//    DECLARE n: INTEGER
//    SET b:=0
//    READ num
//            n :=num
//    WHILE num>0
//    a:=num MOD 10
//    b:= b*10+a
//    num := num DIV 10
//    END WHILE
//            IF b==n THEN
//            PRINT "PALINDROME"
//                    ELSE
//    PRINT "NOT PALINDROME"
//    END IF
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, a, b = 0, n;
            System.out.print("Enter number: ");
            num = sc.nextInt();
            n = num;
            while(num > 0)
            {
                a = num % 10;
                b = b * 10 + a;
                num = num / 10;
            }
            if(b == n)
            {
                System.out.println("PALINDROME");
            }
            else
            {
                System.out.println("NOT PALINDROME");
            }
        }
}
