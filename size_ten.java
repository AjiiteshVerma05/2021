
public class size_ten {
    public static void main(String args[])
    {
        char a[]={'a','B','c','I','o','U'};
        char b='A';
        char c='Z';
        int upp=0;
        int vol=0;
        for(int i=0;i<6;i++)
        {
          if(a[i] >= b && a[i]<=c)
           {
             upp++;
           }
           else if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i'
           || a[i]== 'o' || a[i] == 'u' || a[i]=='I'||a[i]=='U')
           {
              vol++ ;  
           }
        }
    System.out.println("total no of vowels"+vol);
    System.out.println("total no of uppercase charracters"+upp);
}
}
