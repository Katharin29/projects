import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int i,j=0;
        int sum1=0;
        int sum=0;
        
        int a[]=new int[n];
        int b[]=new int[m];
        for( i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for( j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        for( i=0;i<n;i++){
    sum1=sum1+a[i];
                    
                }
    for( j=0;j<m;j++){
        sum=sum+b[j];
    }
    if(sum==sum1){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
        
            
        
    }
}
    