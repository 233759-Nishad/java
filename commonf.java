import java.util.*;
public class commonf
{
    public static void main(String args[])
    {
        int i,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a=s.nextInt();
        System.out.println("Enter second Number: ");
        int b=s.nextInt();
        for(i=1;i<=a||i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        System.out.println("Number of common factors: "+count);
    }
}