import java.util.Scanner;
public class Main {
	
	public static void celciusToFahrenheit(int celcius){
		double Fahrenheit = (celcius * 1.8000) + 32.00;
		System.out.println(Fahrenheit + "°F");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int celcius;
		celcius = in.nextInt();
		
		celciusToFahrenheit(celcius);
	}
}
