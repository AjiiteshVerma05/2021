


import java.util.*;
class binarysearch
{
public static void main ( String args[])
{
try (Scanner sc = new Scanner(System.in)) {
    int mid,right=0;
    int as[]= {10,20,30,40,60};
    System.out.println(" Enter number to be searched ");
    boolean found=false;
    int target=sc.nextInt();
    int left=0;right=as.length;mid=0;
    while (found==false && left<right)
    {
    mid=(left+right)/2;
    if (as[mid] == target)
    found=true;
    
    else
    if (as[mid]>target)
    right=mid-1;
    else
    left=mid+1;
    }
    if(found)
    System.out.println (" Number found at "+mid);
    else
    System.out.println (" Number not found ");
}
}
}