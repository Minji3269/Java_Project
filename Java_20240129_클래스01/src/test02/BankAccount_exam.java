package test02;

public class BankAccount_exam {

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount("001122","강민지",10000);
		
		bank.displayBalance();
		bank.deposit(1000000);//입금
		
		bank.displayBalance();
		
		bank.withdraw(500000);//출금
		bank.displayBalance();
	}

}
