package Test_클래스;

public class Bank {
	final static int MAX_BALANCE = 1000000;
	final static int MIN_BALANCE = 0;
	
	private int balance;
	
	
	
	
		
public int getBalance() {
		return balance;
	}





	public void setBalance(int balance) {
		if (balance < Bank.MAX_BALANCE || balance > Bank.MIN_BALANCE) {
			return;
		} 
		this.balance = balance;
	}





public static void main(String[] args) {
	Bank bank = new Bank();
	
	bank.setBalance(10000);
	System.out.println("현재 잔고: " + bank.getBalance()); //현재 잔고: 10000

	bank.setBalance(-100);
	System.out.println("현재 잔고: " + bank.getBalance()); //현재 잔고: 10000

	bank.setBalance(2000000);
	System.out.println("현재 잔고: " + bank.getBalance()); //현재 잔고: 10000

	bank.setBalance(300000);
	System.out.println("현재 잔고: " + bank.getBalance()); //현재 잔고: 300000

}
}
