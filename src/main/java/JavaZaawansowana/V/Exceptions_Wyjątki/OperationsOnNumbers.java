package JavaZaawansowana.V.Exceptions_Wyjątki;

public class OperationsOnNumbers {
    public static void main(String[] args) {

        int dividend = 10;
        int divisor = 0;
        try{
            int result = dividend / divisor;// exception divionByZero!
        }catch (ArithmeticException ae){
            System.err.println("Dzielenie przez 0!");
        }


//         Uwaga to samo działanie ale na liczbach zmiennoprzecinkowych
        double dividend1 = 10;
        double divisor1 = 0;
        double result1 = dividend1 / divisor1;// infinity (nieskończoność)
        System.out.println(result1);
//      Ważny jest typ zmiennej pola (integery nie mają nieskończoności, double (liczby zmiennoprzecinkowe) mają!!!
    }
}
