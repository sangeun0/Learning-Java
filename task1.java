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
			
		
/*삼항 연산자의 문법은 다음과 같습니다.

문법
조건식 ? 반환값1 : 반환값2

 

물음표(?) 앞의 조건식에 따라 결괏값이 참(true)이면 반환값1을 반환하고, 결괏값이 거짓(false)이면 반환값2를 반환합니다.

이때 반환값에는 값뿐만 아니라 수식, 함수 호출 등 여러 가지 형태의 명령문이 올 수 있습니다.*/
