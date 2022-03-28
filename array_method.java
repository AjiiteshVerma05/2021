
import java.util.*;
class array_method
{
    public String[] arr()
    {
        Scanner in=new Scanner(System.in);
        String city[]=new String[5];
        for (int i=0;i<=4;i++)
        {
            city[i]=in.nextLine();
        }
        return city;
    }
    public static void main(String args[])
    {
        array_method obj=new array_method();
        String city[] =obj.arr();
        System.out.println(city);
    }

}