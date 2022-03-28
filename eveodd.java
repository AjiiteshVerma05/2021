import java.util.Scanner;
import java.io.*;
public class eveodd {
     int a[];
     int sumeve;
     int sumod;
    public void INPU () throws IOException,NumberFormatException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try (Scanner in = new Scanner(System.in)) {
        
        a=new int[10];
        sumeve=0;
        sumod=0;
        for(int i=0;i<=9;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int j=0;j<=9;j++)
        {
            if(a[j]%2==0)
            {
                sumeve+=a[j];
            }
            else{
                sumod+=a[j];
            }
        }

      System.out.println("Even sum::"+sumeve+" Odd sum::"+sumod);
    }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        eveodd obj=new eveodd();
        obj.INPU();
    }
    
}
