package assignment10_3;

class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	
	public Account(String account, int balance, double interestRate) {
		this.account= account;
		this.balance= balance;
		this.interestRate= interestRate ;	
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance ) {
		this.balance = balance;
	}
	
	
	
	double calculateInterest() {
		return balance * interestRate;
	}
	
	public void deposit(int money) {
		 balance= money + balance;
		 System.out.println(balance);
	}
	
	public void withdraw(int money) {
		balance= balance - money;
		System.out.println(balance);
	}
	
}



	public class AccountTest{
		public static void main(String[] args) {
			Account obj= new Account("441-02900-1203", 500000, 0.073);

			System.out.println("계좌정보: "+obj.getAccount() + " 현재잔액: " + obj.getBalance());
			System.out.println("이자: "+ obj.calculateInterest());
			
			obj.deposit(20000);
			System.out.println("계좌정보: "+obj.getAccount() + " 현재잔액: " + obj.getBalance());	
			System.out.println("이자: "+ obj.calculateInterest());
			
			obj.withdraw(20000);
			System.out.println("계좌정보: "+obj.getAccount() + " 현재잔액: " + obj.getBalance());	
			System.out.println("이자: "+ obj.calculateInterest());
			
			
			
		}
		
	}
