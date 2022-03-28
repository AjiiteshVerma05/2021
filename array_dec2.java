


import java.util.Scanner;
public class array_dec2 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[4][3];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=in.nextInt();


            }
        }
        for(int z=0;z<4;z++)
        {
            for(int y=0;y<2;y++)
            {
                System.out.print("\t"+a[z][y]);
            }
        }
    }
    
}
