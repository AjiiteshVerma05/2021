import java.util.Scanner;
public class emailchecker {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an email to check:");
        String email=in.nextLine();
        int a=email.length();
        int sepc=0;
        int dot=0;
        int alpha1=0;
        int alpha2=0;
        for(int i=0;i<a;i++)
        {
            if(email.charAt(i)=='@')
            {
                sepc++;
            }
            else if(email.charAt(i)=='.')
            {
                dot++;
            }
            else if(email.charAt(i)=='@')
            {
                if(Character.isLetter(email.charAt(i+1)))
                {
                   alpha1++;
                }
            }
            else if(email.charAt(i)=='.')
            {
                if(Character.isLetter(email.charAt(i-1)))
                {
                    alpha2++;
                }
            }
        }
        if(sepc==1&&dot==1&&alpha1==1&&alpha2==1)
        {
            System.out.println("Goomd");
        }
        else{
            System.out.println("not good");
        }
        System.out.println(alpha1+alpha2);
    }
    
}
