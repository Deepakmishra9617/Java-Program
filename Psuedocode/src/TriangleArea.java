import java.util.Scanner;
public class TriangleArea {
//    PROCEDURE TRIANGLE(b, h)
//    DECLARE area : REAL
//    area := (b * h) / 2
//PRINT area
//END PROCEDURE
//    DECLARE b : REAL
//    DECLARE h : REAL
//    READ b
//    READ h
//    CALL TRIANGLE(b, h)


 public static void triangle(double b, double h) {
            double area = (b * h) / 2;
            System.out.println(area);}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double b = sc.nextDouble();
            double h = sc.nextDouble();
triangle(b, h);
}}
