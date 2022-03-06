import java.util.*;
class RemoveWord
{
	static void Remove(String str,String word)
	{
		String msg[] = str.split(" ");
		String new_str = "";
		for (String words : msg) 
		{
			if(!words.equals(word))new_str += words + " ";
		}
		System.out.print(new_str);
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String w=sc.nextLine();
		Remove(s,w);
	}
}    