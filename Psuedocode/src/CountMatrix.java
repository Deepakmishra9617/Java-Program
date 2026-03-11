import java.util.Scanner;
public class CountMatrix {
//    DECLARE x :ARRAY [3][3] OF INTEGER
//            SET EVEN :=0
//    SET odd :=0
//    FOR  r: 0 TO 2
//    FOR c: 0 TO 2
//    READ x[r][c]
//    END FOR
//            END FOR
//                    FOR  r: 0 TO 2
//    FOR c: 0 TO 2
//    IF x[r][c] MOD 2==0 THEN
//    INCREMENT EVEN
//            ELSE
//    INCREMENT ODD
//                                                                      END IF
//                    END FOR
//                            END FOR
//    PRINT EVEN
//     PRINT ODD
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] x = new int[3][3];
            int even = 0;
            int odd = 0;
            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    x[r][c] = sc.nextInt();
                }}
            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    if(x[r][c] % 2 == 0)
                        even++;
                    else
                        odd++;
                }}
            System.out.println("Even = " + even);
            System.out.println("Odd = " + odd);
        }}
