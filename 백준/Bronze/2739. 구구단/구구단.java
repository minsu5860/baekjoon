import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = a; i <= a; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}