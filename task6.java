package roof1;
import java.util.Scanner;
public class task6 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.println("밑변: ");
			float w= input.nextFloat();
			System.out.println("높이: ");
			float l= input.nextFloat();
			float cal= (w*l/2);
			System.out.println("삼각형 넓이"+cal);
			System.out.println("countinue?: ");
			String s= input.next();
			if (s.equals("y")|| s.equals("Y") ) {//string.equals는 대상의 내용비교, string==는 대상주소값 비
			continue;}
			else {break;}
		}
			
			
		
	}


}