package assignment_10_1;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double yard;
		double cm;
		
		System.out.println("yard?");
		yard= input.nextDouble();
		
		cm= (yard * 91.44);
		
		System.out.println(yard+"yard = "+Math.round(cm*10)/10.0+"cm");
	}

}
