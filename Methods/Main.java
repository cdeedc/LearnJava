import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		int a = 2, b = 3,
			x = 5, y = 7;

		System.out.println(a + " + " + b + " = " + sum(a, b));
		System.out.println(x + " + " + y + " = " + sum(x, y));
		clearLine();

		System.out.println(a + " - " + b + " = " + difference(a, b));
		System.out.println(x + " - " + y + " = " + difference(x, y));
		clearLine();

		System.out.println(product(2, 3));
		System.out.println(product(5, 6));
		clearLine();

		System.out.println(arithmeticMean(2, 3));
		System.out.println(arithmeticMean(5, 6));
		clearLine();

		System.out.println(max(2, 3));
		System.out.println(max(5, 6));
		clearLine();

		System.out.println(min(2, 3));
		System.out.println(min(5, 6));
		clearLine();

		System.out.println(a + "^" + b + " = " + power(a, b));
		System.out.println(x + "^" + y + " = " + power(x, y));
		clearLine();

		findSign(-12);
		findSign(0);
		findSign(+12);
		clearLine();

		System.out.println("Inverse of 125 is " + reverseNumber(125));
		System.out.println("Inverse of 5632 is " + reverseNumber(5632));
		clearLine();

		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(-3);
		vec.add(3);
		vec.add(13);
		for(int i = 12; i <= 20; i += 3)
			vec.add(i);
		System.out.println("Sum of vector is " + sumVector(vec));
		System.out.println("Maximum of vector is " + maxVector(vec));
		clearLine();

		quotientRemainder(a, b);
		quotientRemainder(x, y);
		clearLine();

		System.out.println(arithmeticMean(5, 2, 4));
		clearLine();

		System.out.println(max(1, -1, 4));
		clearLine();

		System.out.println(x + " -> " + checkParity(x));
		System.out.println(x * y - a * b - 1 + " -> " + checkParity(x * y - a * b - 1));
		clearLine();

		System.out.println(x + "! = " + factorial(x));
		System.out.println(y + "! = " + factorial(y));
		clearLine();

		System.out.println(gaussSum(5));
		clearLine();

		sumDigits(x + y * a);
		sumDigits(b * y - x);
		clearLine();

		checkPrimality(x);
		checkPrimality(y * y - 1);
		clearLine();
	}

	static void clearLine() {
		System.out.println();
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int difference(int a, int b) {
		return a - b;
	}

	static int product(int a, int b) {
		return a * b;
	}

	static float arithmeticMean(int a, int b) {
		return (float)(a + b) / 2;
	}

	static int max(int a, int b) {
		int res = a;
		if(res < b)
			res = b;
		return res;
		// return a > b ? a : b;
	}

	static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}

	static int min(int a, int b) {
		int res = a;
		if(res > b)
			res = b;
		return res;
		// return a < b ? a : b;
	}

	static void findSign(int x) {
		if(x < 0)
			System.out.println("Negative number");
		else if(x == 0)
			System.out.println("Number is zero");
		else // if(x > 0)
			System.out.println("Positive number");
	}

	static long power(int a, int n) {
		long res = 1, x = a;
		
		while(n > 0) {
			if((n & 1) != 0)
				res *= x;
				
			x *= x;
			n >>= 1;
		}
		
		return res;
	}

	static long sumSquares(int n) {
		long sum = 0;
		
		for(int i = 1; i <= n; i++)
			sum += (long)i * i;
			
		return sum;
	}

	static int reverseNumber(int n) {
		int inv = 0;
		
		while(n > 0) {
			int digit = n % 10;
			inv = inv * 10 + digit;
			n /= 10;
		}
		
		return inv;
	}

	static int sumVector(Vector<Integer> vec) {
		int sum = 0;
		
		for(int i = 0; i < vec.size(); i++)
			sum += vec.get(i);
			
		return sum;
	}

	static int maxVector(Vector<Integer> vec) {
		int maxVal = vec.get(0);
		
		for(int i = 1; i < vec.size(); i++)
			maxVal = max(maxVal, vec.get(i));
			
		return maxVal;
	}

	static void quotientRemainder(int a, int b) {
		if(b == 0) {
			System.out.println("Division by 0 is not possible");
			return;
		}
		
		int q = a / b, r = a % b;
		System.out.println(a + " / " + b + " = " + q + " remainder " + r);
	}

	static float arithmeticMean(int a, int b, int c) {
		return (float)(a + b + c) / 3;
	}

	static boolean checkParity(int x) {
		if(x % 2 == 0)
			return true;

		return false;
	}

	static long factorial(int n) {
		if(n == 0)
			return 1;
			
		return factorial(n - 1) * n;
	}

	static long gaussSum(int n) {
		long sum = 0;
		
		for(int i = 1; i <= n; i++)
			sum += i;
			
		return sum;
		// long sum = n * (n + 1) / 2;
		// return sum;
	}

	static void sumDigits(int n) {
		int sum = 0, nCopy = n;
		
		while(n > 0) {
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}
		
		System.out.println("Sum of digits of " + nCopy + " = " + sum);
		return;
	}

	static boolean prime(int n) {
		if(n <= 3)
			return n >= 2;
			
		if(n % 2 == 0 || n % 3 == 0)
			return false;
			
		for(int d = 5; d * d <= n; d += 6)
			if(n % d == 0 || n % (d + 2) == 0)
				return false;
				
		return true;
	}

	static void checkPrimality(int n) {
		boolean isPrime = prime(n);
		
		if(isPrime == true)
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is composite");
	}
}
