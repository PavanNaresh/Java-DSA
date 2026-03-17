import java.util.*;
class rangeofarmnum{
    private static boolean armstrong(int n){
        int sum=0;
        int temp1=n;
        int count=0;
        while(temp1>0){
            count++;
            temp1/=10;
        }
        int temp2=n;
        while(temp2>0){
            int d=temp2%10;
            sum+=Math.pow(d, count);
            temp2/=10;
        }
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(armstrong(i))
                System.out.println(i+" ");
            
    }
}
}