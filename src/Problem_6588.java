import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem_6588 {

    private static final int MAX_SIZE = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> primes = new ArrayList<>();
        boolean[] nonPrimes = new boolean[MAX_SIZE + 1];
        nonPrimes[0] = nonPrimes[1] = true;

        for (int i = 2; i * i <= MAX_SIZE; i++) {
            if (nonPrimes[i]) continue;

            primes.add(i);
            for (int j = i + i; j <= MAX_SIZE; j += i) {
                nonPrimes[j] = true;
            }
        }

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) break;

            boolean result = false;
            for (int i = 1; i < primes.size(); i++) {
                int a = primes.get(i);
                int b = n - a; // e.g. n = a + b = a + (n - a)
                if (!nonPrimes[b]) {
                    System.out.println(n + " = " + a + " + " + b);
                    result = true;
                    break;
                }
            }

            if (!result) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

        reader.close();
    }
}
