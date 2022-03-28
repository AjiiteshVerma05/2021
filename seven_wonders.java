import java.util.Scanner;
public class seven_wonders {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String wonder[]={"Taj Mahal","Great Wall of china","chichen itza","petra","christ the redeemer","machu pichu","colloseeum","giza"};
    
    String city[]={"agra","china","mexico","jordan","janerio","peru","egypt"};
    String inp=in.nextLine();
    for(int i=0;i<7;i++)
    {
        if(inp.equals(city[i]))
        {
            System.out.println(wonder[i]+city[i]);
        }
        else{
            System.out.println("enter valid name");
        }
    }
    }
    
}
