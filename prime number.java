import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                c++;
            }
        }
        System.out.println(c==1?"1":"0");
    }
}