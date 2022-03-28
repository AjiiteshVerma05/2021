import java.util.*;
public class date_month{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a[]={"Januaray","Febuary","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        int dat=in.nextInt();
        int mon=in.nextInt();
        int yer=in.nextInt();
        switch(mon)
        
        {
            case 1:
            System.out.println(dat+"/"+a[0]+"/"+yer);
            break;
            case 2:
            System.out.println(dat+"/"+a[1]+"/"+yer);
            break;
            case 3:
            System.out.println(dat+"/"+a[2]+"/"+yer);
            break;
            case 4:
            System.out.println(dat+"/"+a[3]+"/"+yer);
            break;
            case 5:
            System.out.println(dat+"/"+a[4]+"/"+yer);
            break;
            case 6:
            System.out.println(dat+"/"+a[5]+"/"+yer);
            break;
            case 7:
            System.out.println(dat+"/"+a[6]+"/"+yer);
            break;
            case 8:
            System.out.println(dat+"/"+a[7]+"/"+yer);
            break;
            case 9:
            System.out.println(dat+"/"+a[8]+"/"+yer);
            break;
            case 10:
            System.out.println(dat+"/"+a[9]+"/"+yer);
            break;
            case 11:
            System.out.println(dat+","+a[10]+"/"+yer);
            break;
            case 12:
            System.out.println(dat+","+a[11]+","+yer);
            break;
        }
        
        }
    }


