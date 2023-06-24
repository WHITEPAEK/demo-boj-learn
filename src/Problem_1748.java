import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1748
 */
public class Problem_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int length = s.length();
        long newLength = 0;

        int max = 1;
        for (int i = 1; i <= length; i++) {
            int pos = max;
            max *= 10;
            if (n < max) max = (n + 1);

            newLength += (long) (((max - 1) - pos) + 1) * i;
        }

        System.out.println(newLength);
        reader.close();
    }
}
