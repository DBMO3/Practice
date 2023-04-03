import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, fibonacci = 0, F0 = 0, F1 = 1;
		n = in.nextInt();
		
		for(int i = 0; i <= n; i++){
			System.out.println("F" + i + ": " + F0);
			fibonacci = F1 + F0;
			F0 = F1;
			F1 = fibonacci;
		}
	}
}
