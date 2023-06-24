import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1107
 * TODO: Unsolved
 */
public class Problem_1107 {

    public static boolean[] isBroken = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int button = sc.nextInt();
            isBroken[button] = true;
        }

        int buttonCount = Math.abs(n - 100); // 채널 N으로 이동하기 위한 버튼 최대 클릭 수 (+/- 버튼으로 이동되는 케이스)

    }
}
