package condition;
import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("정수를 입력해주세요: ");
	int n = input.nextInt();
	
	if (n<0) {
		System.out.println("minus");
	}
	else if (n==0) {
		System.out.println("zero");
	}
	else {
		System.out.println("plus");
	}
	
}
}
