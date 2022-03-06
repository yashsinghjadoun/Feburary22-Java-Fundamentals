import java.util.*;
class FirstIndex
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int a=1;
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter Number to be Searched");
		int d=sc.nextInt();
		System.out.print("Number is present at index ");
		for(int i=0;i<n;i++)
		{
		    if(d==arr[i])
			{
				System.out.println(i);	
				a=0;
				break;
			}
		}
		if(a==1)System.out.println("Element not Found");
	}
}