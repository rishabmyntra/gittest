package functions;

import java.util.Scanner;

public class all_functions {

	public static int rotation2(int n, int r) {
		int ans = 0, count = 0;
		int temp = n;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int rem = n % (int) Math.pow(10, r);
		n = n / (int) Math.pow(10, r);
		ans = n + rem * (int) Math.pow(10, count - r);
		return ans;
	}

	public static int rotation(int n, int r) {
		int temp = n;
		int count = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		r = r % count;
		if (r < 0) {
			r = r + count;
		}
		while (r-- > 0) {
			int rem = n % 10;
			n = n / 10;
			n = n + rem * (int) Math.pow(10, count - 1);
		}
		return n;
	}

	public static int dec_bin(int a) {
		int mul = 1;
		int ans = 0;
		while (a > 0) {
			int rem = a % 2;
			ans = ans + rem * mul;
			mul *= 10;
			a /= 2;
		}
		return ans;
	}

	public static int bin_dec(int a) {
		int mul = 1;
		int ans = 0;
		while (a > 0) {
			int rem = a % 10;
			ans = ans + rem * mul;
			mul *= 2;
			a /= 10;
		}
		return ans;
	}

	public static int inverse(int a) {
		int pos = 1;
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum = sum + pos * (int) Math.pow(10, rem - 1);
			pos++;
			a /= 10;
		}
		return sum;
	}

	public static int SI(int P, int R, int T) {
		return (P * R * T) / 100;
	}

	public static String odd_even(int a) {
		if (a % 2 == 0) {
			return "Even";
		}
		return "Odd";
	}

	public static int lcm(int a, int b) {
		int max = Math.max(a, b);
		for (int i = max;; i++) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}
	}

	public static String prime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}

	public static int sum1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void fibo(int c) {
		int a = 0;
		int b = 1;
		while (c > 0) {
			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
			c--;
		}
		System.out.println();
	}

	public static int reverse(int n) {
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n /= 10;
		}
		return ans;
	}

	public static int gcd1(int a, int b) {
		int min = (int) Math.min(a, b);
		for (int i = min; i >= 2; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter no. a and b for gcd");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(gcd1(a, b));

		System.out.println("enter no. you want to reverse");
		int n = s.nextInt();
		System.out.println(reverse(n));

		System.out.println("enter no. of fibo series");
		int d = s.nextInt();
		fibo(d);

		System.out.println("enter n of natural no. series");
		int m = s.nextInt();
		System.out.println(sum1(m));

		System.out.println("enter no. to check whether prime or not");
		int pr = s.nextInt();
		System.out.println(prime(pr));

		System.out.println("enter nos. to find lcm");
		int l1 = s.nextInt();
		int l2 = s.nextInt();
		System.out.println(lcm(l1, l2));

		System.out.println("enter no. to find even or odd");
		int A = s.nextInt();
		System.out.println(odd_even(A));

		System.out.println("enter Principle,rate,time for simple interest");
		int P = s.nextInt();
		int R = s.nextInt();
		int T = s.nextInt();
		System.out.println(SI(P, R, T));

		System.out.println("enter no. you want to inverse");
		int inv = s.nextInt();
		System.out.println(inverse(inv));

		System.out.println("enter no. you want to convert from binary to becimal");
		int bin = s.nextInt();
		System.out.println(bin_dec(bin));

		System.out.println("enter no. you want to convert from decimal to binary");
		int dec = s.nextInt();
		System.out.println(dec_bin(dec));

		System.out.println("enter no. you want to want to rotate and no. of times");
		int no = s.nextInt();
		int ro = s.nextInt();
		System.out.println(rotation(no, ro));
		System.out.println(rotation2(12345, 2));
	}
}