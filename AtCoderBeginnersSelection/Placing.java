import java.util.Scanner;

public class Placing {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        
        int i = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                i++;
            }
        }

        System.out.println(i);
    }
}