package Arrays;

import java.util.Arrays;

public class HalfReverse {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8};
		
		int i = a.length/2;
		int k = a.length-1;
		
		for( ;i<k;i++,k--)
		{
			int temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			
		}
		System.out.println(Arrays.toString(a));
	}
}
