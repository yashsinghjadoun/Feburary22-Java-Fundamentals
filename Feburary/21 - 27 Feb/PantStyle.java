class PantStyle
{
	public static void main(String ar[])
	{
		int r,s, c;
        for(r = 0; r<5; r++)
        {
            for(c = 5 ; c>r; c--)System.out.print("* ");
            for(s = 1; s<=4*r;s++)System.out.print(" ");
            for(c = r+1 ; c<=5; c++)System.out.print("* ");
            System.out.println();
	    }
	}
}