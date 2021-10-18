package assignment10_3;

public class Dice2 {
	
	private int dice;
	
	
	public Dice2() { //생성
		dice=0;
	
	}
	
	
	public int getDice() { //값 전달
		return dice;
		
	}
	
	public void setDice(int dice) { //값 저장
		this.dice = dice;
	}
	
	
	public int pick() {
		int dice= (int)(Math.random()*6)+1;
		return dice;
		
	}
	
	
	public static void main(String[] args) {
		Dice2 obj1 = new Dice2();
		Dice2 obj2 = new Dice2(); 
		
		
		int count=0;
		
		while (true) {//필드값 변경, 사용
			obj1.setDice(obj1.pick());
			obj2.setDice(obj2.pick());
		
			if (obj1.getDice()+obj2.getDice() != 2)
				count+=1;
				System.out.println( "첫번째 주사위: " +obj1.getDice() +" 두번째 주사위: "+ obj2.getDice()+" 합계: "+(obj1.getDice()+obj2.getDice()));
			
				if (obj1.getDice()+obj2.getDice() == 2)	
				break;
				
		}
		System.out.println(" 횟수: "+count);
			}
		
	
	
	
}
