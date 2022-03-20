class Employee
{
	private String id;
	private String name;
	private String department;
	private String location;
	void setId(String id){this.id=id;}
	void setname(String name){this.name=name;}
	void setdepartment(String department){this.department=department;}
	void setlocation(String location){this.location=location;}
	public String toString()
	{
		return this.location;
	}
	public static void main(String ar[])
	{
		Employee e1=new Employee();
		e1.setlocation("Banglore");
		Employee e2=new Employee();
		e2.setlocation("Banglore");
		Employee e3=new Employee();
		e3.setlocation("Banglore");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
