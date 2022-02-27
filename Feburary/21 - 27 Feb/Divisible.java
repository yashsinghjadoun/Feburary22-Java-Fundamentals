import java.util.*;
class Divisible
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%2==0&&n%8==0)&&n%12!=0)System.out.println("Yes");
		else System.out.println("No");
	}
}