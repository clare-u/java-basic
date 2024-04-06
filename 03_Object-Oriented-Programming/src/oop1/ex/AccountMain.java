package oop1.ex;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();

		account.deposit(10000);
		System.out.println("잔고: " + account.balance);
		account.withdraw(9000);
		System.out.println("잔고: " + account.balance);
		account.withdraw(2000); // 오류 메세지 출력
		System.out.println("잔고: " + account.balance);
		
//		잔고: 10000
//		잔고: 1000
//		잔액 부족
//		잔고: 1000

	}

}
