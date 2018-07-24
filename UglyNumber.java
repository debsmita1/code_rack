/* Ugly Number is a number having prime factors 2, 3 or 5. Write a program to find the nth Ugly Number.*/
import java.util.*;

public class Test {

	private static int minimum(int a,int b,int c)
	{
		a=(a<b)?a:b;
		return (a<c)?a:c;
			
	}
	public static void main(String args[])throws Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		
		arr[0]=1;
		int i2,i3,i5;
		i2=i3=i5=0;
		for(int i=1;i<n;i++)
		{
			int min=minimum(arr[i2]*2, arr[i3]*3, arr[i5]*5);
			
			arr[i]=min;
			if(min==arr[i2]*2)
				i2++;
			if(min==arr[i3]*3)
				i3++;
			if(min==arr[i5]*5)
				i5++;
		}
		System.out.println(arr[n-1]);
	}
  }
