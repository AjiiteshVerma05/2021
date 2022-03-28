public class div_seven{
    public static void main(String args[]) {
        int ab[][]={
            {10,14},
            {7,49},
        };
        int count=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(ab[i][j]%7==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}