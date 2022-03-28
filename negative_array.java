
public class negative_array {
    public static void main(String[] args) {
        int a[]={1,-2,-3,-5,7,8};
        for(int j=0;j<a.length;j++)
        {
            if(a[j]<0)
            {
                int am=a[j];
                System.out.println("Negative numbers are"+am);
            }

        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                int ma=Math.abs(a[i]);
                System.out.println("The absolute value is:"+ma);
            }
        }
    }

    
}