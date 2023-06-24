import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/17427
 */
public class Problem_17427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += (long) i * (n / i);
        }

        System.out.println(result);
    }
}