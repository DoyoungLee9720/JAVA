package sub4;

public class Account {
	protected String bank;
	protected String acc;
	protected String name;
	protected int balance;
	
	public Account(String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("---------------------");
		System.out.println("증권사 : " + bank);
		System.out.println("계좌번호 : " + acc);
		System.out.println("예금주 : " + name);
		System.out.println("현재잔액 : " + balance);
		
	}
}
