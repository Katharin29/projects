import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n/i==i){
                System.out.println(i);
            }
        }
    }
}