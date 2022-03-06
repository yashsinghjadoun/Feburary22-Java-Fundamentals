import java.util.*;
class SearchWord
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String w=sc.nextLine(); 
		int intIndex = s.indexOf(w);
	    if(intIndex == - 1)System.out.println("Not found"); 
		else System.out.println("Found at index " + intIndex);
	}
}