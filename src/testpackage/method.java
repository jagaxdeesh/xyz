package testpackage;

public class method {
	
	static int currentbalance = 1000;
	
	public static void greeting() {
		System.out.println("hii welcome to the bank.");
	}

	public void deposit(int amount) {
		currentbalance = currentbalance + amount;
		System.out.println("your deposit amount:"+currentbalance);
	}
	
	public static void withdraw(int amount) {
		currentbalance = currentbalance - amount;
		System.out.println("your withdraw amount:"+currentbalance);
	}
	
	public static int getcurrentbalance() {
		System.out.println("currentbalance :"+currentbalance);
		return currentbalance;
	}
	
	public static void main(String[] args) {
		method m = new method();
		method.greeting();
		m.deposit(456);
		withdraw(400);
		getcurrentbalance();

	}

}
