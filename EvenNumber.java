import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		
		if(n%2 == 0){
			System.out.println("EVEN NUMBER");
		} else {
			System.out.println("NOT EVEN NUMBER");
		}
	}
}
