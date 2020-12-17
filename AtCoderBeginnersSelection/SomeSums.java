import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        int n, a, b;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int d = digit(i);
            if(a <= d && d <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static int digit(int n) {
        if(n < 10) return n;
        return digit(n/10) + n%10;
    }
}
