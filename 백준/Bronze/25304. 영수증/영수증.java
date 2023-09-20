import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int cnt = sc.nextInt();

        for(int i = 1; i <= cnt; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
            }
            if(total == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
        }
    }
}