import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t,sum=0;
        int te=n;
        while(n>0){
            t=n%10;
            sum=sum+(t*t*t);
            n=n/10;
        }
        System.out.println((te==sum)?"true":"false");
    }
}