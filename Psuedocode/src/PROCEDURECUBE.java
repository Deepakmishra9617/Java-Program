import java.util.Scanner;
public class PROCEDURECUBE {
//    DECLARE n : INTEGER
//
//    READ n
//
//    PROCEDURE cube(n)
//
//    DECLARE result : INTEGER
//    result := n * n * n
//    PRINT result
//
//    END PROCEDURE
//
//    CALL cube(n)

    public static void cube(int n) {
            int result = n * n * n;
            System.out.println(result);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            cube(num);
        }}

