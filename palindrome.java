import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		word = in.nextLine();
		
		StringBuilder string = new StringBuilder();
		string.append(word);
		string.reverse();
		System.out.println(string);
		
		if(word.equalsIgnoreCase(string.toString())){
			System.out.println("It's palindrome");
		} else {
			System.out.println("It isn't palindrome");
		}
		
	}
}
