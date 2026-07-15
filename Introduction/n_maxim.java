import java.util.Scanner;

public class n_maxim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, val, valMax = Integer.MIN_VALUE;
    
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            val = sc.nextInt();
            valMax = max(valMax, val);
        }

        System.out.println(valMax);
        sc.close();
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
