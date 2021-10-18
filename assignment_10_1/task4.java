package assignment_10_1;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int avg;
		int sum;
		System.out.print("첫번째 정수를 입력하세요: ");
		num1= input.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		num2= input.nextInt();
		System.out.print("세번째 정수를 입력하세요: ");
		num3= input.nextInt();
		
		sum= (num1+num2+num3);
		avg=  sum/3;
		
		System.out.println("sum = "+sum+"\n"+"avg = "+avg);
				
	}
}
