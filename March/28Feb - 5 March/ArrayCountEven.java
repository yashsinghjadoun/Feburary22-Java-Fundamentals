import java.util.*;
class ArrayCountEven
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.print("Even numbers present count is = ");
		for(int i=0;i<n;i++)if(arr[i]%2==0)c++;
		System.out.println(c);
	}
}