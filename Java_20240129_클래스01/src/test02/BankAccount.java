package test02;

public class BankAccount {
		
	private String accountNumber;
	private String accountHolder;
	private int balance;
	
	BankAccount(){
		
	}
	
	BankAccount(String an , String ah, int b){
		accountNumber = an;
		accountHolder = ah;
		balance = b;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	void displayBalance() {
		System.out.println("잔액 : " + balance);
	}
}
