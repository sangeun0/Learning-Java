package condition;
import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("year: ");
		int y = input.nextInt();
		
		if (y%4 == 0 || y%100!=0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}
		}

	
}
