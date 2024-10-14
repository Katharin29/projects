import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i=0;
        int sum=0;
        int k=n*(n+1)/2;
        for( i=0;i<n-1;i++){
            a[i]=s.nextInt();
        }
        for( i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(k-sum);
            
        
    }
}