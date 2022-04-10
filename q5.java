
import java.util.*;
public class q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("input number of terms:");
        int n=sc.nextInt();
        int x=0;
        int y=1,w=x+y;
        if(n==1 || n==2){
            System.out.println("1");
        }
        else if (n==3){
            System.out.println(x);
            System.out.println(y);
            System.out.println(x+y);
        }
        else if(n>0){
            System.out.println(x);
            System.out.println(y);
            System.out.println(x+y);
        }
        for(int i=4;i<=n;i++){
            x=y;
            y=w;
            w=x+y;
            System.out.println(w);
        }
    }
}
