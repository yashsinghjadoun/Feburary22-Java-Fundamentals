import java.util.*;
class ArrayEven
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Even numbers present are");
		for(int i=0;i<n;i++)if(arr[i]%2==0)System.out.println(arr[i]);
	}
}