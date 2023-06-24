import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1476
 */
public class Problem_1476 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int inE = sc.nextInt();
        int inS = sc.nextInt();
        int inM = sc.nextInt();

        int e = 1, s = 1, m = 1;
        for (int i = 1; ; i++) {
            if (e == inE && s == inS && m == inM) {
                System.out.println(i);
                break;
            }

            e++;
            s++;
            m++;

            if (e == 16) e = 1;
            if (s == 29) s = 1;
            if (m == 20) m = 1;
        }
    }
}