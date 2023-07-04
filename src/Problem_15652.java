import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15652
 */
public class Problem_15652 {

    private static int[] storage = new int[9];
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        progression(1, 1, n, m);
        System.out.println(sb.toString());
    }

    public static void progression(int index, int s, int n, int m) {
        if (index == m + 1) {
            for (int i = 1; i < m + 1; i++) {
                sb.append(storage[i]);
                if (i != m) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        for (int i = s; i <= n; i++) {
            storage[index] = i;
            progression(index + 1, i, n, m);
        }
    }
}
