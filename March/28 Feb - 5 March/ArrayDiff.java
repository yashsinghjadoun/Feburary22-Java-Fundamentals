import java.util.*;
class ArrayDiff
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int a[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter Elements of 2nd array");
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		System.out.println("Difference is ");
		for(int i=0;i<n;i++)System.out.println(arr[i]-a[i]);
	}
}