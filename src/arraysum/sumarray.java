package arraysum;

import java.util.Scanner;
class sumarray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int a[] = new int[range];
		int sum=0;
		for(int i=0;i<range;i++)
		{
			int item =sc.nextInt();
			a[i] = item;
		}
		for(int i=0;i<range;i++)
		{
			sum = sum +a[i];
		}
		System.out.println(sum);
	}
}
