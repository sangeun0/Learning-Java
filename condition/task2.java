package condition;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요: ");
		String word = input.next();
		
		if (word.equals("A")) {
			System.out.println("Excellent");
		}
		else if (word.equals("B")) {
			System.out.println("Good");
		}
		else if (word.equals("C")) {
			System.out.println("Usually");
		}
		else if (word.equals("D")) {
			System.out.println("Effort");
		}
		else if (word.equals("F")) {
			System.out.println("Failure");
		}
		else {
			System.out.println("Error");
		}
	}
}
