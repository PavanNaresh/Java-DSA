import java.util.*;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int c=0;
        int temp=n;
        while(temp>0)
        {
            c++;
            temp/=10;
        }
        int pow=(int)Math.pow(10,c);
        int lastDigits=sq%pow;
        System.out.println(lastDigits==n?true:false);
    }
}