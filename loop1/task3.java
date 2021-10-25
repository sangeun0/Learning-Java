package loop1;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int n;
		System.out.println("하나의 자연수 입력하세요: ");
		n= input.nextInt();
		
		for (int i=1; i<11; i++)
		{
			System.out.println(n + "*"+ i+"="+(n*i));
		}
	}
}
