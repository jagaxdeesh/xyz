package testpackage;

public class testpratice {
	
	static int currentBalance = 1000;
	
	public static void greetcustomer() {
		System.out.println("hi welcome bank");	
		System.out.println("your blance $:" + currentBalance);
		}

	public void deposite(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("your deposite amount after:" + currentBalance);
	}
	
	public void withdraw(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("your withdraw amount " + currentBalance);
	}
	
	public static void main(String[] args) {
		
		testpratice t = new testpratice(); // here create object 
		
		greetcustomer();
		t.deposite(300);
		t.withdraw(100);
	}
}