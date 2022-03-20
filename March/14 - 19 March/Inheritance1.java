public class Inheritance1
{
    public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Inheritance1 d = new Inheritance1();
        d.speak();
        Inheritance1 b = new Beagle();
        b.speak();
    }
}
class Beagle extends Inheritance1
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}
