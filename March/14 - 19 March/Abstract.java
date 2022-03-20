abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Abstract extends Book
{
	public void setTitle(String s){super.title=s;}
	String getTitle(){
        return title;
	}
	public static void main(String ar[])
	{
		Abstract a=new Abstract();
		a.setTitle("Yash Jadoun");
		System.out.println(a.getTitle());
	}
}
