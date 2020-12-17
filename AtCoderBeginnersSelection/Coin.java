import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        int a, b, c, x;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();

        int count = 0;
        for(int i = 0; i <= a; i++) {
            for(int j = 0; j <= b; j++) {
                for(int k = 0; k <= c; k++) {
                    if(x - (500*i+100*j+50*k) == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
