public class Person
{
   private String name;
   private String email;
   private String phoneNumber;
   private int age;
   public Person(String theName)
   {
      this.name = theName;
   }
   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}
   public int getage() { return this.age;}
   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public void setage(int age) { this.age = age;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber+" "+this.age;
   }
   public static void main(String[] args)
   {
      Person p1 = new Person("Yash");
      System.out.println(p1);
      Person p2 = new Person("Jadoun");
      p2.setEmail("yashsinghjadoun@gmail.com");
      p2.setPhoneNumber("8878883834");
	  p2.setage(22);
      System.out.println(p2);
   }
}