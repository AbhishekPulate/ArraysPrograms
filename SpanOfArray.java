package Arrays;
import java.util.Scanner;
public class SpanOfArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array Elements : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int max = findMax(arr);
		int min = findMin(arr);
		
		int span = max - min;
		
		System.out.println("Span of The Given Array is : "+span);
		
	}
	public static int findMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMin(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}
