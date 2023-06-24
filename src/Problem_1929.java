import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1929
 */
public class Problem_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] nonPrimes = new boolean[n + 1];
        nonPrimes[0] = nonPrimes[1] = true;

        for (int i = 2; i * i <= n; i++) { // e.g. m = 16, 3 * 3 <= 16 (true) / 5 * 5 <= 16 (false)
            if (nonPrimes[i]) continue; // e.g. i = 4 인 경우, 2의 배수 제거 시점에 4의 배수 또한 전부 제거

            for (int j = i + i; j <= n; j += i) { // e.g. i의 배수 제거 (e.g. i = 2 경우, 4, 6, ..., 16 제거)
                nonPrimes[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!nonPrimes[i]) {
                System.out.println(i);
            }
        }
    }
}
