public class GCDofOddAndEvenSums {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }
    public static int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n,
            sumEven = n * (n + 1);
        return gcd(sumOdd, sumEven);
    }

    public static int gcd(int a, int b) {
        int r = 0;
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
