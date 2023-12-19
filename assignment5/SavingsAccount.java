//Laird,Chris
//1229_4026; December 11,2022
/*Description: Creating a class that contains contructors and methods to calculate montly interest rate*/

public class SavingsAccount {
  /** Annual interest rate for all account holders */
  public static double annualInterestRate;

  /** The number of the objects created */
  private static int numberOfAccounts = 0;

  /** the savings balance for the objects */
  private double savingsBalance;

  /** Construct a savings account with blance of 0.0 */
  public SavingsAccount() {
    this(0.0);
  }

  /** Construct a savings account with a specified balance */
  public SavingsAccount(double newBalance) {
    savingsBalance = newBalance;
    numberOfAccounts++;
  }

  /**Calculate monlthle interest*/
  public double calculateMonthlyInterest(){
	double monthlyInterest = this.savingsBalance * annualInterestRate / 12;
	this.savingsBalance += monthlyInterest;
	return this.savingsBalance;
  }

  /**Modify the interest rate*/
  public static void modifyInterestRate (double newInteresRate) throws IllegalArgumentException {
    if (newInteresRate >= 0)
      annualInterestRate = newInteresRate;
    else
      throw new IllegalArgumentException(
        "rate must be 0.0 - 1.0");
  }


  /** Return savings balance */
  public double getSavingsBalance() {
    return this.savingsBalance;
  }


  /** Return numberOfAccounts */
  public static int getNumberOfAccounts() {
    return numberOfAccounts;
  }

}
