
import java.util.*;
public class q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input two numbers:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p,hcf,lcm;
        int q=m*n;
        while (n!=0) {
            p = n;
            n = m % n;
            m = p;
        }
        hcf=m;
        System.out.println("hcf:" + hcf);
        lcm=q/hcf;
        System.out.println("Lcm:" + lcm);
    }
}



