class AccountTester {

	public static void main(String[] args) {
		Account[] customers = new Account[3];

		customers[0] = new Account("Mark Jonston", 270, 600); // make an Account
															// object

		// Acc1.customerName="John Smith"; //set the customer Name
		// Acc1.customerAge= 73; // Age of account holder
		// Acc1.deposit(1); //deposit
		// Acc1.withdraw(4);
		// Acc1.balance=100;
		// System.out.println("Your balance is" +Acc1.balance); //display
		// Balance
		// Acc1.overdraftLimit=700;
		// System.out.println("You can withdraw"
		// +(Acc1.balance+Acc1.overdraftLimit));
		// Acc1.printStatement();

		int c;

		customers[1] = new Account("Lou Ecksteintein", 400, 700); // make an Account
																// object
		// Acc2.customerName="Matt Symons"; //set the customer Name
		// Acc2.customerAge=24;
		// Acc2.deposit(100); //balance
		// System.out.println("Your balance is" +Acc2.balance); //display
		// Balance
		// Acc2.overdraftLimit=600;
		// System.out.println("You can withdraw"
		// +(Acc2.balance+Acc2.overdraftLimit));

		customers[2] = new Account();
		customers[2].SetCustName("John Blfhe");
		customers[2].SetOverdraftLimit(432);

		

		// random deposit and withdraw for Acc.1 and Acc.2
		for (int i = 1; i <= 12; i++) {
			
			for(int j=0; j<=2; j++){
			// Acc1
			customers[j].deposit(1000 * Math.random());
			// System.out.println(Acc1.totalDeposit);

			customers[j].withdraw(1000 * Math.random());
			// System.out.println(Acc1.totalWithdraw);

			// Acc2
			//customers[1].deposit(500 * Math.random());
			//customers[1].withdraw(500 * Math.random());

			// Acc3
			//customers[2].deposit(500 * Math.random());
			// System.out.println(Acc1.totalDeposit);

			//customers[2].withdraw(500 * Math.random());
			}
		}

		customers[0].printStatement();

		customers[1].printStatement();

		customers[2].printStatement();

		//if (customers[0].getBalance() < customers[1].getBalance()) {
			//System.out.print("\n" + customers[1].getName()
					//+ " Had a better financial year than " + customers[0].getName());

		//} else {

			//System.out.println("\n" + customers[0].getName()
					//+ " Had a better financial year than " + customers[1].getName()
					//+ "\n");
		//}
		
		double richest=customers[0].getBalance();
		int richestCustIndex=0;
		
		for(int i=0; i <=2; i++){
			double annualBalance=customers[i].getBalance();
			if(annualBalance>richest){
				richest=annualBalance;
				richestCustIndex=i;
			}
			
		}
		System.out.println("The richest customer is: "+customers[richestCustIndex].getName()+" With a balance of "+customers[richestCustIndex].getBalance());
		

		// if((Acc1.balance+Acc1.overdraftLimit)>=(Acc2.balance+Acc2.overdraftLimit)){
		// System.out.println("\n"+Acc1.customerName+", Age "+Acc1.customerAge+", Name Length "+Acc1.customerName.length()+" Can withdraw more funds than "+Acc2.customerName+" Name length "+Acc1.customerName.length()+", Age "+Acc2.customerAge);
		// }
		// else{
		// if((Acc1.balance+Acc1.overdraftLimit)<=(Acc2.balance+Acc2.overdraftLimit)){
		// System.out.println("\n"+Acc2.customerName+", Age "+Acc2.customerAge+" Can withdraw more funds than "+Acc1.customerName+", Age "+Acc1.customerAge);
		// }else{
		// System.out.println("bla");
		// /}}
	}

}
