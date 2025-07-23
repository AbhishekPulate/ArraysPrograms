package Arrays;

import java.util.Scanner;
public class SumOfTwoArrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array : ");
		int s1 = sc.nextInt();
		
		int[] arr1 = new int[s1];
		
		System.out.println("Enter the elements of first array : ");
		
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Second array : ");
		int s2 = sc.nextInt();
		
		int[] arr2 = new int[s2];
		
		System.out.println("Enter the elements of Second array : ");
		
		for(int i = 0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		int[] arr3 = new int[(s1>s2)?(s1):(s2)];
		
		int c = 0;
		
		int i = s1-1;
		int j = s2-1;
		int k = arr3.length-1;
		
		while(k>=0)
		{
			int d = c;
			if(i>=0)
			{
				d+=arr1[i];
			}
			if(j>=0)
			{
				d+=arr2[j];
			}
			c = d/10;
			d = d%10;
			arr3[k] = d;
			
			i--;
			j--;
			k--;
			
		}
		if(!(c==0))
		{
			System.out.print(c);
		}
		
		for (int val : arr3) {
			System.out.print(val);
		}
	}
}
