package roof1;

import java.util.Scanner;
public class task5 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int count=0;
		
		
		while(true) {
			
		System.out.println("정수를 입력하세요: ");
		int n= input.nextInt();
		int i=1;
		if (n==0) 
			break;
		if (n%3!=0 && n%5!=0) 
			count +=i;
		
		
		}
		System.out.println(count);
}
}
