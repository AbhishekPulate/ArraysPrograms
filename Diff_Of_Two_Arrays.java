package Arrays;
import java.util.*;
public class Diff_Of_Two_Arrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		int cnt1 = count(num1);
		int[] arr1 = new int[cnt1];
		arr1 = add(num1,cnt1);
		System.out.println(Arrays.toString(arr1));
		

		System.out.print("Enter Second number : ");
		int num2 = sc.nextInt();
		int cnt2 = count(num2);
		int[] arr2 = new int[cnt2];
		arr2 = add(num2,cnt2);
		System.out.println(Arrays.toString(arr2));
		
	
		
		 int[] result = new int[arr2.length];
	        
	        int i = arr1.length - 1;
	        int j = arr2.length - 1;
	        int k = arr2.length - 1;
	        int borrow = 0;

	        while (j >= 0) {
	            int d1 = (i >= 0) ? arr1[i] : 0;
	            int d2 = arr2[j];

	            int sub = d2 - borrow - d1;

	            if (sub < 0) {
	                sub += 10;
	                borrow = 1;
	            } else {
	                borrow = 0;
	            }

	            result[k] = sub;

	            i--; j--; k--;
	        }
	        
	        
		int idx = 0;
		while(idx<result.length)
		{
			if(result[idx]==0)
			{
				idx++;
			}
			else
			{
				break;
			}
		}
		
		
		
		System.out.println("After successuful subtraction the result is as follows. :");
		
		while(idx<result.length)
		{
			System.out.print(result[idx]);
			idx++;
		}
		
	}
	public static int count(int num)
	{
		int cnt = 0;
		for(int i = num;i>0;i/=10)
		{
			cnt++;
		}
		return cnt;
	}
	public static int[] add(int num,int cnt1)
	{
		int [] demo = new int[cnt1];
		for(int i = num;i>0;i/=10)
		{
			int rem = i%10;
			demo[cnt1-1] = rem;
			cnt1--;
		}
		return demo;
	}
	public static int[] arraySubtraction(int[]a1,int[]a2)
	{
		int index1 = a1.length-1;
		boolean flg = false;
		int max = a2.length;
		int[] diff = new int[max];
		for(int i = max-1;i>=0;i--)
		{
			boolean carry = false;
			if(a2[i]==(-1))
			{
				a2[i] +=10;
				a2[i-1] -=1;
			}
			if(index1<0)
			{
				diff[i] = a2[i] ;
			}
			else if(a1[index1]>a2[i])
			{
			
					
					a2[i-1] -=1;
					a2[i] +=10; 
				
				
				diff[i] = a2[i] - a1[index1];
				index1--;
			}
			else 
			{
				diff[i] = a2[i] - a1[index1];
				
				index1--;
			}
			
		}
		return diff;
	}

}
