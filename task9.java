package loop2;

import java.util.Scanner;

public class task9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("몇 줄? ") ;
		int n = input.nextInt();
		int a=1;
		

		for (int x =1; x <n+1; x++) {
			for (int y=1; y<n+1; y++) {
				System.out.print(a + " "); //1부터 시작 
				a += 2; //2씩 커짐
				if (a>10) {
					a=1; //a값이 10보다 커지면 다시 1로 돌아감
				}
			}System.out.println(" ");

	}
	}


}
