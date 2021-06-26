import java.util.Scanner;

public class Core { // class
	
	private static String name;

	public static void main(String[] args) { // method
		
		askName();
		
		int i = 0;
		
		do {
			System.out.println("i$ " + i);
			i++;
		} while (false);
		
	}
	
	public static void askName() {
		System.out.println("Whats your name$ ");
		
		Scanner s = new Scanner(System.in);
		name = s.next();
		s.close();
		
		if (name.equals("Matthew")) {
			System.out.println("hey dev");
		} else {
			System.out.println("hello " + name);
		}
	}
}