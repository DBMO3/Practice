import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i = 1;
		n = in.nextInt();
		
		int fact = 1;
		while(i <= n){
			fact = fact * i;
			i++;
		}
		
		System.out.println(fact);
	}
}
