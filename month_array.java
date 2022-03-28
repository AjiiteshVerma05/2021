import java.util.Scanner;
public class month_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String date = in.nextLine();
        String d[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEPT","OCT","NOV","DEC"};
        int a = date.indexOf("/");
        int b = date.indexOf("/", a + 1);     
        int month = Integer.parseInt (date.substring (a+1, b));
      for(int j=0;j<12;j++)
           {
            if(month==9)
            {
                System.out.println(d[8]);
                break;
            }
           }
       }
    }
