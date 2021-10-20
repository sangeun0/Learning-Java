package condition;
import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("year? ");
		int y = input.nextInt();

		if (y%4!=0 && y%100!=0) {
			System.out.println("month? ");
			int m = input.nextInt();

			int[] list = {1,3,5,7,8,10,12};
			int[] list2= {4,6,9,11};
			
			if (m ==2) {
				System.out.println("28");
			}

			for (int l:list) {
				if (m == l) {
					System.out.println("31");
					break;}
			}
			for (int i:list2) {
				if (m == i) {
					System.out.println("30");
					break;}
			}


		}
	}
}




