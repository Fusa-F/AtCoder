import java.util.Scanner;

public class Otoshidama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y;
        n = sc.nextInt();
        y = sc.nextInt();

        int a = -1;
        int b = -1;
        int c = -1;

        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= n - i; j++)
            {
                int k = n - i - j;
                int sum = 10000*i + 5000*j + 1000*k;
                if(sum == y)
                {
                    a = i;
                    b = j;
                    c = k;
                }
            }
        }
        System.out.println(a + " " + b + " " + c + " ");
    }
}
