package roof2;
import java.util.Scanner;
public class task2 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("하나의 자연수 입력하세요: ");
			int n= input.nextInt();
			
			System.out.println("하나의 자연수 입력하세요: ");
			int m= input.nextInt();
			
			if (m<n) {
				int l=m;
				m=n;
				m=l;
			}
			
			for (int o=1; o<10; o++) {
				System.out.println();
				{for (int i= n; i<=m; i++)
			System.out.print(i + "*"+ o+"="+(i*o)+ "   ");	
			}
			}
		}
		}
			
			
			
			
		
		
				
					
				
		


