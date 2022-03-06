import java.util.*;
class ArrayMidle
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		if(n%2==0)System.out.println("The Element at Middle indexes are="+arr[(n/2)-1]+" and "+arr[n/2]);
		else System.out.println("The Element at middle index is "+arr[(n/2)]);
	}
}