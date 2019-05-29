package day41_customclasses;

public class CapitalOne {
	public static void main(String[] args) {
		BankAccount n = new BankAccount();
		
		n.accountHolder = "Saddam Hussein";
		n.accountNumber = 1245893984;
		n.deposit(456.45);
		n.withdraw(45.6);
		n.showBalance();
		n.charge(23.44, "wooden spoon");
		n.showBalance();
	}
}
