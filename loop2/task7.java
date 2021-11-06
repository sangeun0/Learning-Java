package loop2;
import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요: ");
		int n= input.nextInt();
		
		for (int x =1; x<n+1; x++) {
			for (int y=n; y>0; y--) {
				if(x>=y) {
					System.out.print(x-y+1 +" ");}
				if (x<y) {
				System.out.print(" "+" ");}
					
				}System.out.println(" ");
				
			}
			
			
		}
		
		
			}
				
			
		
	
