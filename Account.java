package ver1;

public class Account {

	
		private double balance;
		private String name;
		
		public Account(double balance) {
			this("Unknown, balance");
		}
		public Account(String name, double balance) {
			this.name = name;
			this.balance = balance;
		}

		
		public Account(String string) {
			// TODO Auto-generated constructor stub
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
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);

		}
}

