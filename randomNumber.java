import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(11);
		int n;
		
		System.out.println("Put a number");
		n = in.nextInt();
		
		for(int attemp = 10; attemp > 0; attemp--){
			if(n > randomNumber || n < randomNumber){
				System.out.println("You have " + attemp + " attemps, Try again");
				n = in.nextInt();
			}
		}
		
		if(n == randomNumber){
			System.out.println("Good job! :D");
		} else {
			System.out.println("Game over");
			System.out.println("The random number is: " + randomNumber);
		}
	}
}
