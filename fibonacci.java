import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println(0);
            return;
        }else if(n == 1) {
            System.out.println(1);
            return ;
        }
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("fibonacci " + c);
    }
    
}
