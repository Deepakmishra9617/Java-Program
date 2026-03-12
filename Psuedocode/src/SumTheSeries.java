public class SumTheSeries {
//    FUNCTION sum (n:INTEGER) :INTEGER
//    DECLARE s : INTEGER
//    SET  s:= 0
//    FOR  i:=1 TO n
//            s:=s+i
//    END FOR
//            RETURN s
//                    END FUNCTION
//                            PRINT sum(5)
    public static void main(String[] args) {

        int n = 5;
        int s = 0;

        for(int i = 1; i <= n; i++) {
            s = s + i;
        }

        System.out.println(s);
    }
}
