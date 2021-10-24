package roof1;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int sum=0;
		int n;
		do {
		System.out.println("100이하의 정수를 입력하세요: ");
		n= input.nextInt();
		}while(0>n && n>100);
		
		for(int i=n; i<=100; i++) {
			sum = sum+ i;
		}
		System.out.println(sum);	
		

}
}
