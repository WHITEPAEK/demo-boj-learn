import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1037
 */
public class Problem_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int divisor = sc.nextInt();

            if (divisor < min) {
                min = divisor;
            }

            if (divisor > max) {
                max = divisor;
            }
        }

        System.out.println(min * max);
    }
}