package Arrays;
import java.util.*;
public class AsterickPattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nnumber of buildings :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		
		System.out.println("Enter the size of coloms ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 10;i>=0;i--)
		{
			for(int j = 0;j<num;j++)
			{
				if(i<arr[j])
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
