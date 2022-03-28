import java.util.*;
public class strin_acc {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String a[]=new String[10];
      for(int i=0;i<9;i++)
      {
          a[i]=in.nextLine();
      }
      for(int j=0;j<9;j=j+2)
      {
          System.out.println(a[j]);
      }

    }
    
}
