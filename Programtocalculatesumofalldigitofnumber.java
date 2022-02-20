import java.util.*;
class Programtocalculatesumofalldigitofnumber
{
	public static void main(String yash[])
	{
		int sum=0;
        System.out.println("Enter a number");  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
        System.out.println(sum);  
	}
}