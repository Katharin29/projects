import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int k=a.length;
        for(int i=0;i<k;i++){
            a[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }}
        for(int  i=0;i<k;i++){
            System.out.println(a[i]);
        }
         System.out.println(a[0]+" "+a[k-1]);
    }

}