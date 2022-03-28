import java.util.Scanner;
public class alphabet_count {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s=in.nextLine();
            String low=s.toLowerCase();
            int l=s.length();
            int ctr=0;
            for(int i=0;i<l;i++)
            {
                if(low.charAt(i)==low.charAt(i+1))
                {
                     ctr++;
                }
            }
            System.out.println(low);
        }
    }
    
}
