package assignment10_2;

import java.util.Scanner;

public class task1 {	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("첫번째 정수를 입력하세요 ");
			num1= input.nextInt();
		System.out.print("두번재 정수를 입력하세요 ");
			num2= input.nextInt();
	
	  
	   
		System.out.println(num1+" > "+num2+" --- "+ (num1> num2 ? 1:0));
		System.out.println(num1+" < "+num2+" --- "+ (num1< num2 ? 1:0));
		System.out.println(num1+" >= "+num2+" --- "+ (num1>= num2 ? 1:0));
		System.out.println(num1+" <= "+num2+" --- "+ (num1<= num2 ? 1:0));
}
}
			
		

