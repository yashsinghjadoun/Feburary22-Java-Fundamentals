import java.util.*;
class ArrayMethodSum
{
	static int add(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)sum+=arr[i];
		return sum;
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
		System.out.println("The addition of Array is = "+add(arr,n));
	}
}