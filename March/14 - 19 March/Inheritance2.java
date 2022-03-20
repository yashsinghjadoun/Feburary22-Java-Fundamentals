public class Inheritance2
{
    private String name;

    public Inheritance2(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
        // ADDED CODE HERE
		if(!(other instanceof Inheritance2)) return false;
		Inheritance2 oth = (Inheritance2)other;       
		if(this.name.equals(oth.name))return true;
		else return false;
	}
    public static void main(String[] args)
    {
        Inheritance2 d1 = new Inheritance2("Rufus");
        Inheritance2 d2 = new Inheritance2("Sally");
        Inheritance2 d3 = new Inheritance2("Rufus");
        Inheritance2 d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}
