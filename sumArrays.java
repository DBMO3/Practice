public class Main {
	public static void main(String[] args) {
		int array[] = {3,7,9,20,58};
		int result = 0;
		for(int i = 0; i < array.length; i++){
			System.out.println(i + ": " + array[i]);
			result += array[i];
		}
		System.out.println(result);
	}
}
