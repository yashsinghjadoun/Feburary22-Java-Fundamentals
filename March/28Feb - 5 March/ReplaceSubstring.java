import java.util.*;
class ReplaceSubstring
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String w1=sc.nextLine();
		String w2=sc.nextLine();
		String str=s.replace(w1,w2);
		System.out.println(str);
	}
}