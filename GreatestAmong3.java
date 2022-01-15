import java.util.*;
class GreatestAmong3
{
public static void main(String ar[])	
{
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a>b && a>c)System.out.println(a+" "+"is greatest");
	if(b>a && b>c)System.out.println(b+" "+"is greatest");
	if(c>b && c>a)System.out.println(c+" "+"is greatest");
}
}