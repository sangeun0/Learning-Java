package roof2;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("행: ");
		int row= input.nextInt();
		System.out.println("열: ");
		int col= input.nextInt();
		
		for (int i=1; i<=row; i++) {
			System.out.println();
			for(int j=1; j<=col; j++)
				System.out.print(i*j+" ");		
			
	}
}
}
