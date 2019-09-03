package functions;
public class max_no_on_right {
	public static void main(String[] args) {
		int[] arr= {3, 9, 4, 6, 7, 5};
		int min=Integer.MAX_VALUE;
		int count=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>min)
			{
				count++;
			}
			else if(arr[i]<=min)
			{
				min=arr[i];
			}
		}
		System.out.println(count);
	}
}