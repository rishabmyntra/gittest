package subarray;

public class maximum_subarray_sum {

	public static void main(String[] args) {
		int[] arr= {-4,-1,3,2,6,-2,-1,-4,-7};
		sumarray(arr);
	}
	public static void sumarray(int[] arr)
	{
		int left=0;
		int right=0;
		int msum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{	
				int csum=0;
				for(int k=i;k<=j;k++)
				{
					csum+=arr[k];
					if(csum>msum)
					{
						msum=csum;
						left=i;
						right=j;
					}
				}
			}
		}
		System.out.println(left+" "+right);
		System.out.println(msum);
	}
}
