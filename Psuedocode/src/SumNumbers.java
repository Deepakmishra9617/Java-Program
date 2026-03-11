import java.util.Scanner;
public class SumNumbers {
//    DECLARE num : INTEGER
//    DECLARE a :INTEGER
//    DECLARE b: INTEGER
//    SET b:= 0
//    READ num
//    WHILE num >0
//    a:=NUM MOD 10
//    b:=b+a
//    num := num DIV 10
//    END WHILE
//            PRINT b


  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, a;
            int b = 0;
            System.out.print("Enter number: ");
            num = sc.nextInt();
            while (num > 0) {
                a = num % 10;
                b = b + a;
                num = num / 10;
            }
            System.out.println("Sum of digits = " + b);
        }
}
