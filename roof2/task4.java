package roof2;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.println("자연수를 입력하세요: ");
		int n= input.nextInt();

		for (int i=1; i<=n; i++) {
			for (int j=0; j<=n; j++)
				if (i>j)
					System.out.print("*");
			System.out.println(" ");
		}
	}
}

