class Account {
    // class variable
	private String customerName;
	private double balance;
	private double totalDeposit;
	private double totalWithdraw;
	private double overdraftLimit;
	private int customerAge;

	// constructor
	Account(String cName, double currBalance, double overdraft) {
		customerName = cName;
		balance = currBalance;
		overdraftLimit = overdraft;

	}

	Account(int Age) {
		customerAge = Age;
	}

	Account() {
	}

	// methods
	void printStatement() {
		System.out.println("\n");
		System.out.println(" Name: " + customerName);
		System.out.println(" Balance: " + balance);
		System.out.println(" Overdraft Limit: " + overdraftLimit);
		System.out.println("\n");
	}

	void deposit(double sum) {
		balance += sum;
		totalDeposit += sum;
	}

	void withdraw(double sum) {
		if (balance + overdraftLimit < sum) {
			System.out.println("\n" + " You cannot withdraw that much! ");
		} else {
			balance -= sum;
			totalWithdraw += sum;
		}
	}

	// Access Methods getter method
	double getBalance() {
		return balance;
	}

	// Getter Overdraft Limit
	double getOverdraftLimit() {
		return overdraftLimit;
	}

	// Setter OVerdraftlimit Method
	void SetOverdraftLimit(double newOverdraft) {
		overdraftLimit = newOverdraft;
	}

	// Getter Deposit
	double getDeposit() {
		return totalDeposit;
	}

	// Get Customer Name
	String getName() {
		return customerName;
	}

	// Set Customer Name
	void SetCustName(String NewCustomerName) {
		customerName = NewCustomerName;
	}

	double getWithdraw() {
		return totalWithdraw;
	}

	double getCustAge() {
		return customerAge;
	}

}
