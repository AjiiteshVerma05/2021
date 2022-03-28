import java.util.Scanner;
public class patternofchoice {
    public static void design(int a,char b)  
    {  
    Scanner in =new Scanner(System.in);  
    a=in.nextInt();
    b=in.next()charAt(0);


    for (int i= 0; i<= a-1; i++)  
    {  
    for (int j=0; j<=i; j++)  
    {  
    System.out.print(" ");  
    }  
    for (int k=0; k<=a-1-i; k++)  
    {  
    System.out.print("*" + " ");  
    }  
    System.out.println();  
    }  
    }  
    }  
    
}
