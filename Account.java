package ver2;

public class Account {

	
		private double balance;
		//New comment for balance
		private String name;
		
		public Account(String string, double balance) {
			this("Unknown, balance");
		}
		public Account(String string) {
			
		}
		public double getBalance() {
			return balance;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0) {
			balance -= amount;
		}
	}
	public String toString() {
		String msg = "name=" + name + ", balance=$" + balance;
		return msg;
	}

	
		public static void main(String[] args) {
		Account a1 = new Account(null, 0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);

		}
}

