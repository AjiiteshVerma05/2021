import java.util.Scanner;
public class array_char3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size");
        int b=in.nextInt();
        char a[]=new char[b];
        int len=a.length;
        int vol=0;
        int con=0;
       for(int i=0;i<b;i++)
       {
           a[i]=in.next().charAt(0);
       }
       for(int j=0;j<b;j++)
       {
          if(a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u')
          {
              vol++;
          }
           else{
               con++;
           }
       }
       System.out.println(len);
       System.out.println(vol);
       System.out.println(con);
    }



}