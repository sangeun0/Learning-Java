package condition;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요: ");
		String word = input.next();
		
	
		switch(word) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
			
		}
		
	}
}
