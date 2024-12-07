import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Convert Celcius to Fahrenheit ");
		System.out.println("2. Convert Fahrenheit to Celcius ");
		System.out.println("Choose between 1 or 2 ");
		
		int temp= scanner.nextInt();
		
		switch (temp) {
		case 1 : System.out.println("Enter celcius value");
		double C = scanner.nextDouble();
		C = (C * 9/5) + 32;
		System.out.println("Your value in Fahreinheit is "+C);
		break;
		
		case 2 : System.out.println("Enter Fahrenheit value");
		double F = scanner.nextDouble();
		F = (F - 32) * 5/9;
		System.out.println("Your value in Celcius is "+F);
		break;
		default : System.out.println("You did not pick between 1 or 2, Please pick between them");
		
		
		
		}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
