import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CardGame {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int a = 0;
        int b = 0;

        // input
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // sort
        while(list.size() > 0) {
            int amax = searchMax(list);
            a += amax;
            list.remove(list.indexOf(amax));
            if(list.size() <= 0) break;
            int bmax = searchMax(list);
            b -= bmax;
            list.remove(list.indexOf(bmax));
        }

        System.out.println(a+b);
    }
    private static int searchMax(List<Integer> list) {
        int max = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
