import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a[]={6,7,8,5};
        int d=s.nextInt();
        int n=a.length;
        int c=s.nextInt();
        int temp[]={6,7,8};
        for(int i=d;i<n;i++){
            a[i-d]=a[i];
            System.out.println(a[i]);
    
        }
        for(int i=n-d;i<n;i++){
            a[i]=temp[i-(n-d)];
        }
        for(int i=0;i<c;i++){
        int temp1=a[0];
        for( i=1;i<n;i++){
            a[i-1]=a[i];
        
        }
        a[a.length-1]=temp1;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
}