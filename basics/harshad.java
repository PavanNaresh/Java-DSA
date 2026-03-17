
import java.util.Scanner;

class harshad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=d;
            temp/=10;
        }
        System.out.println(n%sum==0?true:false);
    }
}
