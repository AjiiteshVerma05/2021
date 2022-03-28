/**
 * TaxCalculator
 */
import java.util.Scanner;
public class TaxCalculator {
    static long PAN;
    static String name;
    static double taxableIncome;
    static double tax;
    public static void inputData()
    {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter PAN Card,Income,and name");
       PAN=in.nextLong();
       taxableIncome=in.nextDouble();
       name=in.nextLine();
    }
    public static void computeData()
    {
        if(taxableIncome<=6000)
        {
            System.out.println("No tax");
        }

    }
        
    }
