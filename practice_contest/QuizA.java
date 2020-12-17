import java.util.Scanner;

public class QuizA {
    public static void main(String[] args) {
        int a, b, c;
        String s;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        b = scanner.nextInt();
        c = scanner.nextInt();

        s = scanner.next();

        System.out.println(a+b+c + " " + s);
    }
}