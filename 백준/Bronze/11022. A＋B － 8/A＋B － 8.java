import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int input = sc.nextInt();

        for(int i = 1; i <= input; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            cnt++;
            System.out.println("Case #" +cnt+ ": " + x + " + " + y + " = " + (x+y));
        }
    }
}