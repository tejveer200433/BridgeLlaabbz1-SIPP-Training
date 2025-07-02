package inherit;

class BankAccount {
 String accountNumber;
 double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }
}

class SavingsAccount extends BankAccount {
 double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Savings Account, Account No: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate);
 }
}

class CheckingAccount extends BankAccount {
 double withdrawalLimit;

 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Checking Account, Account No: " + accountNumber + ", Balance: " + balance + ", Withdrawal Limit: " + withdrawalLimit);
 }
}

class FixedDepositAccount extends BankAccount {
 int tenureInMonths;

 public FixedDepositAccount(String accountNumber, double balance, int tenureInMonths) {
     super(accountNumber, balance);
     this.tenureInMonths = tenureInMonths;
 }

 public void displayAccountType() {
     System.out.println("Account Type: Fixed Deposit Account, Account No: " + accountNumber + ", Balance: " + balance + ", Tenure: " + tenureInMonths + " months");
 }
}

public class BankAccountTypes {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount("SA123", 5000.0, 0.02);
     CheckingAccount ca = new CheckingAccount("CA456", 2000.0, 500.0);
     FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000.0, 12);

     System.out.println("--- Bank Account Types ---");
     sa.displayAccountType();
     ca.displayAccountType();
     fda.displayAccountType();
 }
}