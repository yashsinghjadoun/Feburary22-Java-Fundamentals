import java.util.*;
class Programtotakeinput
{
	public static void main(String yash[])
	{
		System.out.println("Enter two number and an operand");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		if(c=='+')System.out.println("The Output is = "+(a+b));
		else if(c=='-')System.out.println("The Output is = "+(a-b));
		else if(c=='*')System.out.println("The Output is = "+(a*b));
		else if(c=='/')System.out.println("The Output is = "+(a/b));
		else System.out.println("Invalid choice");
   	}
}