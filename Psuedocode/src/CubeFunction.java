import java.util.Scanner;
public class CubeFunction {
//    FUNCTION cube(n)
//    DECLARE result : INTEGER
//    result := n * n * n
//    RETURN result
//    END FUNCTION
//    DECLARE num : INTEGER
//    DECLARE ans : INTEGER
//    READ num
//    ans := cube(num)
//    PRINT ans
   public static int cube(int n) {
            int result = n * n * n;
            return result;}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int ans = cube(num);
            System.out.println(ans);
         }}
