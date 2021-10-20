package assignment10_2;
import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {

		float[][] list = new float[2][2];	
		Scanner input = new Scanner(System.in);

		for (int n=0; n<list.length; n++) 
			for(int m=0; m<list.length; m++) {
				System.out.println("키? " + "몸무게? ");
				list[n][m] = input.nextFloat();
			}

		boolean b = true;
		int i = b ? 1: 0;


		if (list[0][0]> list[1][0] && list[0][1]>list[1][1]) {
			System.out.println(i);
		}
		b= false;
		i = b?  1 : 0;
		if (list[0][0]<= list[1][0] || list[0][1]<=list[1][1] ) {
			System.out.println(i);
		}






	}
}