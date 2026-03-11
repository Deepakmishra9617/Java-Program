import java.util.Scanner;
public class CountSpecificNUMber {
//    DECLARE a:INTEGER
//    DECLARE num:INTEGER
//    DECLARE count : INTEGER
//    DECLARE d : INTEGER
//    SET count :=0
//    READ num
//            READ d
//    WHILE num >0
//    a:=num MOD 10
//    IF a==d THEN
//            count := count+1
//    END IF
//            num := num DIV 10
//    END WHILE
//            PRINT COUNT

   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, a, d;
            int count = 0;
            System.out.print("Enter number: ");
            num = sc.nextInt();
            System.out.print("Enter digit to count: ");
            d = sc.nextInt();
            while (num > 0) {
                a = num % 10;
                if (a == d) {
                    count = count + 1;
                }
                num = num / 10;
            }
            System.out.println("Count = " + count);}
}
