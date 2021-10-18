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


/*삼항 연산자의 문법은 다음과 같습니다.

문법
조건식 ? 반환값1 : 반환값2

 

물음표(?) 앞의 조건식에 따라 결괏값이 참(true)이면 반환값1을 반환하고, 결괏값이 거짓(false)이면 반환값2를 반환합니다.

이때 반환값에는 값뿐만 아니라 수식, 함수 호출 등 여러 가지 형태의 명령문이 올 수 있습니다.*/
			
			
			
			
		
		
				
					
				
		


