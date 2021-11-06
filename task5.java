package loop2;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("number? ");
		int n = input.nextInt();
	
		
		for (int x = 0; x< n+1 ; x++) {
				for (int y=0; y <x+2 ; y++) {
					System.out.print(" ");
				}
				for (int z=(n-x)*2-1; z>0; z-- ) { 
					System.out.print("*");
				}System.out.println(" ");
			
			}
		
		}
		
	
	
}
