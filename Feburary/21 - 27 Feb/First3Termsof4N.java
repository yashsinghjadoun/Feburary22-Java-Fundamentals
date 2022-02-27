class First3Termsof4N
{
	public static void main(String ar[])
	{
		int count=0;;
		for(int i=1;count<3;i++)
		{
			int num=(4*i)+9;
			if(num%3==0)
			{
				System.out.println(num);
				count++;
			}
		}
	}
}