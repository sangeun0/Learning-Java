package condition;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("number? ");
		int n = input.nextInt();
		
		if (n ==1) {
			System.out.println("dog");
		}
		else if (n ==2) {
			System.out.println("cat");
		}
		else if (n == 3) {
			System.out.println("chick");
		}
		else {
			System.out.println("I don't know");
		}
	}
}
