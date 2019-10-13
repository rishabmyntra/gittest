package github_lecture16;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 5, 4, 7, 1 };
		sort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void sort(int[] arr, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int mid = (lo + hi) / 2;
		int left = lo;
		int right = hi;
		int pivot = arr[mid];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		sort(arr, lo, right);
		sort(arr, left, hi);
	}
}
