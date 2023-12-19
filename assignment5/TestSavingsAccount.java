//Laird,Chris
//1229_4026; December 11,2022
/*Description: Creating a test class that contains objects and print a 
table of the savings balance after each month*/

public class TestSavingsAccount{
	public static void main(String [] args){
		
		//Creating reference variables and new SavingAccount objects
		SavingsAccount savingsAccount1 = new SavingsAccount(2000.0);
		SavingsAccount savingsAccount2 = new SavingsAccount(3000.0);
		
		//modifying interest rate to 0.04
		try {
			SavingsAccount.modifyInterestRate(0.04);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		//print ouf for monthly balance for 1 year at .04
		System.out.printf("%s%n%s%n", "Monthly balance for the year at .04", "Balances:");
		
		//print out the two savings accounts and their base savings 
		System.out.printf("%28s%s%n%s%10s%.2f%s%.2f%n", "Saver 1   ", "Saver 2", "Base",
			"$", savingsAccount1.getSavingsBalance(), "   $",
				savingsAccount2.getSavingsBalance());
		
		//printing out savings after calculating monthly interest for 9 months
		for(int i = 1; i <= 9; i++){
			System.out.printf("%s%d%s%s%.2f%s%.2f%n", "Month ", i, ":\t ", "$",
				savingsAccount1.calculateMonthlyInterest(), "   $",
					savingsAccount2.calculateMonthlyInterest());
		}
		/**printing out savings after calculating monthly interest
		for the last 3 months, this was to fix the spacing issue*/
		for(int i = 10; i <= 12; i++){
			System.out.printf("%s%d%s%s%.2f%s%.2f%n", "Month ", i, ": ", "$",
				savingsAccount1.calculateMonthlyInterest(), "   $", 
					savingsAccount2.calculateMonthlyInterest());
		}
		
		//printing a blank space
		System.out.println();
		
		//modifying the interest rate to 0.05
		try {
			SavingsAccount.modifyInterestRate(0.05);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
		
		//print out after changing to 0.05
		System.out.printf("After setting interest rate to .05 and calculating monthly interest %n%n%s%n%s%s%n%s%.2f%s%.2f%n",
			"Balances:", "Savings1\t\t", "Savings2","$",
				savingsAccount1.calculateMonthlyInterest(), "\t\t$",
					savingsAccount2.calculateMonthlyInterest());
					
		//printing a blank space
		System.out.println();
		
		//System print saying the it will try to set the interest rate to -0.02
		System.out.println("Try to set interest rate to -0.02 and calculating monthly interest");
		
		//setting interest rate to -0.02
		try {
			SavingsAccount.modifyInterestRate(-0.02);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}

		//print line for the number of accounts
		System.out.println("Number of accounts created is: " + 
			SavingsAccount.getNumberOfAccounts());
	}
}