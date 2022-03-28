import java.util.Scanner;
public class str_seperate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int len=a.length();
        for(int i=0;i<len;i++)
        {
            a= a.replace("a","z");
         a= a.replace("k","g");
            if(a.charAt(i)!=' ')
           {
              System.out.print(a.charAt(i)+",");
           }
        }
    }
}
    

