package ex01_exception.customException;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		System.out.println("예금액 : " + account.getBalnace());
		try {
			account.withdraw(150000);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}
	}
}
