import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/4375
 */
public class Problem_4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int result = 0;
            for (int i = 1; ; i++) {
                result = ((result * 10) + 1) % n;
                if (result == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
