import java.util.*;
class Powerof2
{
static boolean isPowerOfTwo(int n)
{
	if(n==0)return false;
    return (int)(Math.ceil((Math.log(n) / Math.log(2))))==(int)(Math.floor(((Math.log(n) / Math.log(2)))));
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(isPowerOfTwo(n))System.out.println(n+" is power of 2");
	else System.out.println(n+" is not power of 2");
}
}