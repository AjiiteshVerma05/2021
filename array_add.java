public class array_add {
public static void main(String args[])
{
    int a[][]={
              {10,20},
              {30,40},
    };
    int b[][]={
        {50,60},
        {70,80},
    };
    int c[][]= new int[2][2];
    for(int i=0;i<2;i++)
    {
       for(int j=0;j<2;j++)
       {
           c[i][j]=a[i][j]*b[i][j];
            
       }
    }
    for(int f=0;f<2;f++)
    {
        for(int y=0;y<2;y++)
        {
         System.out.println(c[f][y]);
        }
    }
}
    
}
