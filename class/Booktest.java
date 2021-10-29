package assignment10_3;
import java.util.ArrayList;
import java.util.Scanner;


class Book{ 

	private String name;
	private int price;
	private double discount;


	public Book(String name, int price, double discount){
		this.name= name;
		this.price= price;
		this.discount= discount;
	}
	public void setPrice(int price) {
		this.price= price;
	}

	public int getPrice() {
		return price;
	}

	public double getDiscount() {
		return price-(price * discount);
		
	}

	public String toString() {
		return "책이름: "+ name + " 책가격: "+price +" 할인률: "+discount;
	}




}


public class Booktest {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int sum=0;
		double sum2=0;
		Book list [] = new Book[3];
		list[0]= (new Book("SQL PLus", 50000, 0.05));
		list[1]=(new Book("Java 2.0", 40000, 0.03));
		list[2]=(new Book("JSP Servlet", 60000, 0.06));
	
		
		for(int l=0; l<list.length; l++) {
		System.out.println(list[l]);
		sum += list[l].getPrice(); 
		sum2+= list[l].getDiscount();
		}System.out.println("총금액: "+sum);
		System.out.println("할인된 금액: "+sum2);
		
		
		
	
}
}
