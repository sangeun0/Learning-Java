package assignment10_2;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번쨰 수: ");
		int n = input.nextInt();
		System.out.println("두번째 수: ");
		int m = input.nextInt();

		n++;
		--m;
		
		int mul= n*m;
		System.out.println(n +" "+m+ " "+mul);
	}
}
