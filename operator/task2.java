package assignment10_2;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

			System.out.println("3개 정수를 입력하시오: ");
			int x = input.nextInt();
			System.out.println("3개 정수를 입력하시오: ");
			int y = input.nextInt();
			System.out.println("3개 정수를 입력하시오: ");
			int z = input.nextInt();
		
			boolean b = true;
			int i= b ? 1:0;
			if (x>y && x>z) {
			System.out.println(i);}
			b= false;
			i= b ? 1:0;
			if (x ==y && x == z) {
			System.out.println(i);
			}
		



	}
}