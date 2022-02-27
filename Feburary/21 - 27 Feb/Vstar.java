class Vstar
{
	public static void main(String ar[])
	{
		for(int i=1;i<6;i++)
		{
			for(int k=i;k<5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==j)System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}