import java.util.Scanner;
public class SimpleInterest {
//    PROCEDURE SI(p, r, t)
//    DECLARE si : REAL
//    si := (p * r * t) / 100
//    PRINT si
//    END PROCEDURE
//    DECLARE p : REAL
//    DECLARE r : REAL
//    DECLARE t : REAL
//    READ p
//    READ r
//    READ t
//    CALL SI(p, r, t)
    public static void SI(double p, double r, double t) {
            double si = (p * r * t) / 100;
            System.out.println(si);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double p = sc.nextDouble();
            double r = sc.nextDouble();
            double t = sc.nextDouble();
            SI(p, r, t);
        }}
