package week5;

import java.util.ArrayList;
import java.util.Scanner;
class User {

	String ID;
	String PW;

	public User(String ID, String PW) {
		this.ID =ID;
		this.PW = PW;}


}


public class TestUser{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<User>();

		while(true) {
			System.out.println("1. sign up" +"\n" + "2. login"+ "\n"+ "3. print all users" + "\n"+ "4. exit" );
			System.out.println("===================================================");
			System.out.println("번호를 입력하시오: ");
			int n = input.nextInt();


			if (n == 4) {
				break;
			}
			if (n == 1) {
				System.out.println("ID: ");
				String ID = input.next();
				System.out.println("PW: ");
				String PW = input.next();
				list.add(new User(ID, PW));
				System.out.println("===================================================");
				continue;
			}
			if (n == 3) {
				for (User obj:list) {
					System.out.println("{"+obj.ID+","+obj.PW+"}"+"\n" +"===================================================");
				}
				if (n ==2) {
					continue;
				}
			}

		}
	}


}