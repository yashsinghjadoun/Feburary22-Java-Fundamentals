import java.util.*;
class ProgramconvertFahrenheitintoCelsius
{
	public static void main(String yash[])
	{
        System.out.println("Enter Temprature in Fahrenheit");  
		Scanner sc=new Scanner(System.in);
		float Fahrenheit=sc.nextFloat();
		float Celsius;    
        Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);  
	}
}