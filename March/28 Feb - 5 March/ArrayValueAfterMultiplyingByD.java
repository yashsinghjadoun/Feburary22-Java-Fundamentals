import java.util.*;
class ArrayValueAfterMultiplyingByD
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter Number to be multiplied");
		int d=sc.nextInt();
		System.out.println("Numbers after multiplying with "+d+" are");
		for(int i=0;i<n;i++)System.out.println(arr[i]*d);
	}
}