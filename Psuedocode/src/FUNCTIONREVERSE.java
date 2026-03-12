public class FUNCTIONREVERSE {
//    FUNCTION rev (n:INTEGER) : INTEGER
//    DECLARE a:INTEGER
//    DECLARE b :INTEGER
//    SET b:=0
//    WHILE n>0
//    a :=n MOD 10
//    b := b*10+a
//    n = n DIV 10
//    END WHILE
//            RETURN b
//                    END FUNCTION
//                            PRINT rev(12345)
public static void main(String[] args) {
int n = 12345;
            int a;
            int b = 0;
            while(n > 0) {
                a = n % 10;
                b = b * 10 + a;
                n = n / 10;}
            System.out.println(b);}}
