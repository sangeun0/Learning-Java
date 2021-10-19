package roof1;
import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		int n;
		int i=1;
		do {
		
			System.out.println("정수를 입력하세요: ");
		n= input.nextInt();
		
		}while( 0>n && n>100);
		while (i<=n) {
		sum += i;
		i++;
	}
	System.out.println(sum);
}
}