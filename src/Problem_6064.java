import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/6064
 */
public class Problem_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            String[] tokens = reader.readLine().split(" ");
            int m = Integer.parseInt(tokens[0]);
            int n = Integer.parseInt(tokens[1]);
            int x = Integer.parseInt(tokens[2]);
            int y = Integer.parseInt(tokens[3]);

            int k = calendar(m, n, x, y);
            System.out.println(k);
        }
    }

    public static int calendar(int m, int n, int x, int y) {
        // k >= 1, (k % m, k % n) = (x, y)
        for (int k = (x - 1); k < (m * n); k+=m) {
            if (k%n == (y - 1)) {
                return k + 1;
            }
        }
        return -1;
    }
}
