


import java.util.Scanner;
public class alpa_con {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String g=in.nextLine();
        String u=g.toUpperCase();
        char b=g.charAt(0);
        int len=g.length();
        char v=g.charAt(len);
        char z[]=new char[len];
        for(char i=b;i<v;i++)
        {
            z[i]=i;
            System.out.println(z[i]);

        }
        
    }
    
}
