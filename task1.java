package roof2;

import java.util.Scanner;


public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요: ");
		int n= input.nextInt();
		
		int count=0;
		int sum=0;
		
		for (int i=1; i<=n; i++)
		{
			if (i%2!=0) {
			sum+= i;
			count+= 1;
			
			if (sum>=n) {
				System.out.println("횟수: "+ count+" "+"합계: "+sum);			
				break;
							
				}
			}
		}
	}
}
