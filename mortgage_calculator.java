import java.util.*; 
import java.text.NumberFormat;
public class Main 
{
    public static void main( String[] args ) 
    {
        Scanner keyboard;
        int Numberof_Month , principal;
        float Annual_Rate , Late_Fee;
        double Monthly_Payment, total_Pay;

        keyboard = new Scanner( System.in );
        System.out.print( "Enter number of Months , principal, annual rate: ");
        Numberof_Month = keyboard.nextInt();
        principal = keyboard.nextInt();
        Annual_Rate=keyboard.nextFloat();
        double month_rate = (Annual_Rate/100)/12.0;
        Monthly_Payment = (principal*month_rate) / (1-Math.pow(1+month_rate, -Numberof_Month));

        total_Pay = Monthly_Payment * Numberof_Month;
        System.out.print( "monthly = " + Math.round(Monthly_Payment) );
        System.out.println( ", total = " + Math.round(total_Pay) );
    }
}
