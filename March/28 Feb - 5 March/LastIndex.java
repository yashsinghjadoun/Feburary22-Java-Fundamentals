import java.util.*;
class LastIndex
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
		for(int i=n-1;i>=0;i--)
		{
		    if(d==arr[i])
			{
        		System.out.print("Number is present at index ");
				System.out.println(i);	
				a=0;
				break;
			}
		}
		if(a==1)System.out.println("Element not Found");
	}
}