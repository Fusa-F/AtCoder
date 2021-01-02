// package AtCoderBeginnersSelection;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Kagami {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int d[] = new int[n];
        for(int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(d[0]);

        for(int i = 0; i < d.length; i++) {
            boolean have = false;
            for (Integer integer : list) {
                if(d[i] == integer) {
                    have = true;
                }
            }
            if(!have) list.add(d[i]);
        }
        System.out.println(list.size());
    }
}
