import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k[]=new int[n+1];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            k[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++){
            k[0]=k[1];
        
            }
        
        for(int i=0;i<n;i++){
            System.out.println(k[i]);
        }
            
        }
    }

