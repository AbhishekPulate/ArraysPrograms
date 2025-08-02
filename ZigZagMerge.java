package Arrays;

import java.util.Arrays;

public class ZigZagMerge {

	public static void main(String[] args) {
		
		int[] a = { 1,2,3,4,5};
		int[] b = {10,20,30,40,50,60,70};
		int[] c = new int[a.length+b.length];
		
		
		int j = 0;
		int k = 0;
		
		for(int i = 0; i<c.length ;)
		{
			if(j<a.length && k<b.length)
			{
				c[i++] = a[j++];
				c[i++] = b[k++];
			}
			if(j<a.length)
			{
				c[i++] = a[j++];
			}
			if(k<b.length)
			{
				c[i++] = b[k++];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
