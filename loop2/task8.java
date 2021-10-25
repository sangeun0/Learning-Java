package roof2;
import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇줄? ");
		int n = input.nextInt();
		int a=1;
		
		for (int x=1; x< n+1 ; x++) {
			for (int y=1; y<n+1; y++) {
				if (x<=y) {
					System.out.print(a++ +" " );
					}
				
				if (x>y) {
					System.out.print(" " + " " );
					
				}
			}System.out.println(" ");
		}
	}
}
