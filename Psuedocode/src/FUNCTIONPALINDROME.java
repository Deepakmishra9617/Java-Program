public class FUNCTIONPALINDROME {
//    FUNCTION palindrome (n:INTEGER) :STRING
//    DECLARE  a:INTEGER
//    DECLARE b :INTEGER
//    DECLARE x :INTEGER
//    SET b:=0
//    SET x :=n
//    WHILE n>0
//    a := n  MOD 10
//    n := n DIV 10
//    b:= b*10+a
//    END WHILE
//            IF b==x THEN
//            RETURN "PALINDROME"
//    ELSE
//    RETURN "NOT PALINDROME"
//    END IF
//    END FUNCTION
//            PRINT palindrome(121)
public static void main(String[] args) {
            int n = 121;
            int a;
            int b = 0;
            int x = n;
            while(n > 0) {
                a = n % 10;
                n = n / 10;
                b = b * 10 + a;
            }
            if(b == x) {
                System.out.println("PALINDROME");}
            else {
                System.out.println("NOT PALINDROME");}}}
