import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] i = new int[n][2];
        for(int k = 0; k < n; k++)
        {
            i[k][0] = sc.nextInt();
            i[k][1] = sc.nextInt();
        }
        for(int l = 0; l < i.length; l++)
        {
            for(int m = 0; m < i[0].length; m++)
            {
                System.out.print(i[l][m] + " ");
            }    
            System.out.println("");
        }
        for(int l = 0; l < i.length; l++)
        {
            for(int m = 0; m < i[0].length; m++)
            {
                
            }    
        }
    }
}
