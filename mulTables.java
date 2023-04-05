import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int table;
		table = in.nextInt();
		
		for(int i = 0; i <= 10; i++){
			int result = table * i;
			System.out.println(table + " X " + i + " = " + result);
		}
	}
}
