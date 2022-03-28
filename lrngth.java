
import java.util.Scanner;
public class lrngth {
    public static void main(String args[])
    {
      try (Scanner in = new Scanner(System.in)) {
        int a[]=new int[10];
           int cnt=0;
           for(int i=0;i<a.length;i++)
           {
               a[i]=in.nextInt();
           }
           for(int j=0;j<a.length;j++)
           {
            int c=a[j]%7;   
            if(c==0)
               {
                   cnt++;
               }
               else{
                   System.out.println("");
               }
           }
           System.out.println(cnt);
    }     
       }
    }   

