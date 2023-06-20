import java.util.Scanner;

public class Problem_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int g = gcd(x, y);
        int l = lcm(x, y, g);

        System.out.println(g);
        System.out.println(l);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static int lcm(int x, int y, int g) {
        return ( g * (x/g) * (y/g) );
    }
}
