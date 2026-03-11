import java.util.Scanner;
public class Reverse {
//    DECLARRE num:INTEGER
//    DECLARE a: INTEGER
//    DECLARE b: INTEGER
//    SET B:=0
//    READ num
//            WHILE num>0
//    a:=num MOD 10
//    b:=b*10+a
//    num := num DIV 10
//    END WHILE
//            PRINT b

 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            int a;
            int b = 0;
            System.out.print("Enter number: ");
            num = sc.nextInt();
            while(num > 0)
            {
                a = num % 10;
                b = b * 10 + a;
                num = num / 10;
            }
            System.out.println("Reverse number = " + b);

        }
    }

