package oop3;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println(Account.money1);
		Account ac = new Account(1000);
		
		System.out.println(ac.money1);
		System.out.println(ac.money2);
		
		Account ac2 = new Account(1000);
		System.out.println(ac2.money1);
		System.out.println(ac2.money2);
		
		Account ac3 = new Account(1000);
		System.out.println(ac3.money1);
		System.out.println(ac3.money2);
	}
}
