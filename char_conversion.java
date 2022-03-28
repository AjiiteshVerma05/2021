import java.util.*;
public class char_conversion {
    public static void main(String args[]){
        char a[]= new char[4];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            a[i]=in.next().charAt(0);
        }
        System.out.println(a);
        int b=a.length;
        for(int i=0;i<4;i++)
        {
           int c=a[i];
           int d=c+2;
           char f=(char) d;
           System.out.println(f);
        }
        
    }
    
}
