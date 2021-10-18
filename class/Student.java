package assignment10_3;

public class Student {
	
		String name;
		String rollno;
		int age;
		
		public Student() {
			name= "freshan";
			rollno= "1111111";
			age= 20;
		}
		public Student(String n, String r, int a) {
			name= n;
			rollno= r;
			age= a;
		}
		public static void main(String[] args) {
			Student obj= new Student("KIM", "20180001", 20);
			System.out.println("학생의 이름: "+obj.name+"\n"+"학생의 학번: "+obj.rollno+"\n"+"학생의 나이: "+obj.age);
		
			
		}
		
		
		
		
	}

