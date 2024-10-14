import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int n=a.length;
        int d=s.nextInt();
        int temp[]={1,2,3,4};
        for(int i=d;i<n;i++){
            a[i-d]=a[i];
    
        }
        for(int i=n-d;i<n;i++){
            a[i]=temp[i-(n-d)];
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    
}