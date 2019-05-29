package day41_customclasses;

import java.text.DecimalFormat;

public class BankAccount {
	double balance; String accountHolder; int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $: "+amount+" to "+accountNumber);
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing $: "+amount+" from "+accountNumber);
		balance-=amount;
	}
	
	public void showBalance() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Account holder: "+accountHolder);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance $: "+df.format(balance));
	}
	
	public void charge(double price, String item) {
		if(balance>=price) {
			System.out.println("buying "+item+" for $"+price+" from account: "+accountNumber);
			balance-=price;
		}else {
			System.out.println("insuffitient funds");
		}
	}

}
