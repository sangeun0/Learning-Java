package roof2;
import java.util.Scanner;

public class task6 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("1부터 100까지 중 하나의 정수를 입력하세요: ");
	int n= input.nextInt();
	
	for (int i=1; i>0 ;i++)
	{
		int m = n*i;
		
		if (m<100) {
			System.out.println(m);
			if (m%10==0) {				
				break;
			}
			
		}
		
		if (m>=100) {
			break;
		
		}
	}
}
}
