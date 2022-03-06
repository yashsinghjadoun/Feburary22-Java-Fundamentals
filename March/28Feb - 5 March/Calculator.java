import java.util.*;
class Calculator
{
	public static void main(String ar[])
	{
		int a=1;
		while(a==1)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulo\n6.Average");
			int b=sc.nextInt();
			System.out.println("Enter two numbers");
			int x=sc.nextInt();
			int y=sc.nextInt();
			switch(b)
			{
				case 1:
				System.out.println("The answer is="+x+y);
				break;
				case 2:
				System.out.println("The answer is="+(x-y));
                break;
				case 3:
				System.out.println("The answer is="+x*y);
				break;
				case 4:
				System.out.println("The answer is="+x+y);
				break;
				case 5:
				System.out.println("The answer is="+x%y);
      			break;
				default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you wan't to continue\n0. to exit\n1. to continue");
			a=sc.nextInt();
		}
	}
}