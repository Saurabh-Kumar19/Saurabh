
import java.util.*;
public class q6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("input number:");
        int n= sc.nextInt();
        int c=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>1){
            System.out.println("not a prime no.");
        }
        else{
            System.out.println("prime no. ");
        }
    }
}
