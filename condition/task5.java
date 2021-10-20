package condition;
import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("gender: ");
		String g= input.next();

		System.out.println("age: ");
		int a = input.nextInt();

		if (g.equals("M")) {
			if (a>=20) {
				System.out.println("Man");}
				if (a<20) {
					System.out.println("Boy");}
			}
		
		if (g.equals("W")) {
			if (a>=20) {
				System.out.println("Woman");}
			if (a<20) {
				System.out.println("Girl");}
			}
		}
	
}
