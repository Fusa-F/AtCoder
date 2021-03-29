import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int Sa = digit(a);
        int Sb = digit(b);
        if(Sa > Sb) System.out.println(Sa);
        else System.out.println(Sb);
    }   
    
    private static int digit(int n) {
        if(n < 10) return n;
        return digit(n/10) + n%10;
    }
}
