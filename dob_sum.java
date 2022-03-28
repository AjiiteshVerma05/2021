public class dob_sum {
    public static void main(String args[])
    {
        double a[]={12.0,23.4,45,34.34,87.98};
        double  sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of array is :"+sum);
        double max=a[0];
        for (int j = 1; j < 5; j++)
        {
             if (a[j] > max)
                 max = a[j];
        }
        System.out.println("largest element is:"+max);
    }
    
}
