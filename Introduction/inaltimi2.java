import java.util.Scanner;

public class inaltimi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        c = sc.nextDouble();
        a = sc.nextDouble();
        b = sc.nextDouble();

        if(validTriangle(a, b, c) == true) {
            double area = calcArea(a, b, c);
            double ha = (2.0d * area) / a,
                   hb = (2.0d * area) / b,
                   hc = (2.0d * area) / c;
            ha = Math.floor(ha * 100) / 100.0d;
            hb = Math.floor(hb * 100) / 100.0d;
            hc = Math.floor(hc * 100) / 100.0d;
            System.out.printf("%.2f %.2f %.2f", ha, hb, hc);
        } else {
            System.out.println("Imposibil");
        }

        sc.close();
    }

    // Verifica daca se poate forma un triunghi cu laturile a, b, c
    public static boolean validTriangle(double a, double b, double c) {
        return (a + b >= c && b + c >= a && c + a >= b);
    }

    // Formula lui Heron
    public static double calcArea(double a, double b, double c) {
        double area = Math.sqrt((double)(a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / 4.0d;
        return area;
    }
}
