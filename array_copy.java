

public class array_copy {
    public static void main(String args[])
    {
        char f[]=new char[3];
        char a[]={'a','b','c','d'};
        for(int i=0;i<3;i++)
        {
               f[i] = a[i];

        }
        for(int i=0;i<=4;i++)
        {
            System.out.println(f[i]); 

        }
        //System.out.println(f[0]); 

    }
    
}
