import java.util.*;
public class sumeveodd {
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
    int arr[] = new int[20];
    int even = 0, odd = 0;
    for(int j=0;j<20;j++)
    {
        arr[j]=in.nextInt();
    }
    for (int i = 0; i < arr.length; i++) 
    {
        if (i % 2 == 0)
            even += arr[i];
        else
            odd += arr[i];
    }

    System.out.println("Even index positions sum: " + even);
    System.out.println("Odd index positions sum: " + odd);
   }

    
}
