
import java.util.*;
public class q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 0;
        if (n < m) {
            for (int i = 0; i <= m; i++) {
                p = 2 * i + 1;
                if (p > n && p < m) {
                    System.out.println(p);
                }
            }
        }
    }
}


