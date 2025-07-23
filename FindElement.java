package Arrays;
import java.util.*;
public class FindElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements in the Array : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		System.out.println("Enter the Value to find :");
		int val = sc.nextInt();
		
		int index = 0;
		boolean flg = false;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				flg = true;
				System.out.println("Value "+val+" is present at "+i+" index.");
			}	
		}
		if(!flg)
		{
			System.out.println("Value "+val+" is present at -1 index.");
		}
	}
}
