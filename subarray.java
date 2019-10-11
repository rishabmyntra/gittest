import java.util.Scanner;
public class kadanes_algorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			sumarray(arr);
		}
	}

	public static void sumarray(int[] arr) {
		int ms = Integer.MIN_VALUE, cs = 0;
		for (int i = 0; i < arr.length; i++) {
			cs += arr[i];
			if (ms < cs) {
				ms = cs;
			}
			if (cs < 0) {
				cs = 0;
			}
		}
		System.out.println(ms);
	}
}
