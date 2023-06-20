import java.util.Scanner;

public class Problem_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
