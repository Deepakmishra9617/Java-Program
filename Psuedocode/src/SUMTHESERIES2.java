public class SUMTHESERIES2 {
//    FUNCTION sum (n:INTEGER) : REAL
//    DECLARE s:INTEGER
//    SET s :=0
//    FOR i:=1 TO n
//            s := s+ 1/i
//    END FOR
//            RETURN s
//                    END FUNCTION
//                            PRINT sum (5)

 public static void main(String[] args) {
            int n = 5;
            double s = 0;
            for(int i = 1; i <= n; i++) {
                s = s + 1.0/i;}
            System.out.println(s);}}

