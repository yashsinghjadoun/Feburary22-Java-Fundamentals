import java.util.*;
class ArrayMethodSwap
{
	static void swap(int arr[],int n,int a,int b)
	{
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
		System.out.println("Array After Swap");		
		for(int i=0;i<n;i++)System.out.println(arr[i]);
	}
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter indexes to be swapped");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Array Before Swap");		
		for(int i=0;i<n;i++)System.out.println(arr[i]);
		swap(arr,n,a,b);
	}
}