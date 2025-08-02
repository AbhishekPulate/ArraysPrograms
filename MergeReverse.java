package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class MergeReverse {
	public static void main(String [] args)
	{
		int[] a = { 1,2,3,4,5};
		int[] b = {10,20,30};
		int[] c = new int[a.length+b.length];
		
		 for(int i = 0;i<c.length;i++)
		 {
			if(i<a.length)
				c[c.length-1-i]=a[i];
			else
				c[c.length-1-i]=b[i-a.length];
			
		 }
		 System.out.println(Arrays.toString(c));
	}
}
