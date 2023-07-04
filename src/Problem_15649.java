import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15649
 */
public class Problem_15649 {

    private static boolean[] isUse = new boolean[9];
    private static int[] storage = new int[9];
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        progression(1, n, m);
        System.out.println(sb.toString());
    }

    public static void progression(int index, int n, int m) {
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

        for (int i = 1; i <= n; i++) {
            if (isUse[i]) continue;
            storage[index] = i;
            isUse[i] = true;
            progression(index + 1, n, m);
            isUse[i] = false;
        }
    }
}
