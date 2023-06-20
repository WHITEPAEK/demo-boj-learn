import java.io.*;

public class Problem_17425 {

    private static final int MAX_SIZE = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] data = initData(MAX_SIZE);

        int t = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(reader.readLine());
            writer.write(data[n] + "\n");
        }
        writer.flush();
        writer.close();
        reader.close();
    }

    public static long[] initData(int size) {
        long[] sumDivisors = new long[size + 1];
        long[] total = new long[size + 1];

        // f(n) = 자연수 N의 모든 약수의 합 (e.g. n = 4, f(n) = 1 + 2 + 4)
        for (int i = 1; i <= size; i++) {
            for (int j = 1; i * j <= size; j++) {
                sumDivisors[i * j] += i;
            }
        }

        // g(n) = f(1) + f(2) + ... + f(n-1) + f(n) (e.g. n = 4, g(n) = f(1) + f(2) + f(3) + f(4))
        for (int i = 1; i <= size; i++) {
            total[i] = total[i - 1] + sumDivisors[i];
        }

        return total;
    }
}
