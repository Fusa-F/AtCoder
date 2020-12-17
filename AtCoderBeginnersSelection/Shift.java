import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int count = -1;
        boolean flg = true;
        while(flg) {
            for(int i = 0; i < a.length; i++) {
                if(a[i] % 2 != 0) {
                    flg = false;
                }
                a[i] /= 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
