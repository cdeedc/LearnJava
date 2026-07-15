import java.util.Scanner;

public class sabc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(s(a, b) + " " + s(b, c) + " " + s(a, c));

        sc.close();
    }

    public static long s(int x, int y) {
        return (((long)(y - x + 1) * (x + y)) >> 1);
    }
}
