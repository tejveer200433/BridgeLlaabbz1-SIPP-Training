package encapsulte;

abstract class BankAccount {
 private String accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public String getHolderName() {
     return holderName;
 }

 public double getBalance() {
     return balance;
 }

 // Encapsulation: balance can only be changed via deposit/withdraw
 protected void setBalance(double balance) {
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited $" + amount + ". New balance: $" + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
     } else if (amount <= 0) {
         System.out.println("Withdrawal amount must be positive.");
     } else {
         System.out.println("Insufficient funds. Current balance: $" + balance);
     }
 }

 public abstract void calculateInterest();

 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: $" + String.format("%.2f", balance));
 }
}

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
     super(accountNumber, holderName, balance);
     this.interestRate = interestRate;
 }

 public double getInterestRate() {
     return interestRate;
 }

 public void setInterestRate(double interestRate) {
     this.interestRate = interestRate;
 }

 @Override
 public void calculateInterest() {
     double interest = getBalance() * interestRate;
     setBalance(getBalance() + interest);
     System.out.println("Interest calculated for Savings Account. Added $" + String.format("%.2f", interest) + ". New balance: $" + String.format("%.2f", getBalance()));
 }
}

//Subclass CurrentAccount
class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
     super(accountNumber, holderName, balance);
     this.overdraftLimit = overdraftLimit;
 }

 public double getOverdraftLimit() {
     return overdraftLimit;
 }

 public void setOverdraftLimit(double overdraftLimit) {
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
         setBalance(getBalance() - amount);
         System.out.println("Withdrew $" + amount + ". New balance: $" + String.format("%.2f", getBalance()));
     } else if (amount <= 0) {
         System.out.println("Withdrawal amount must be positive.");
     } else {
         System.out.println("Withdrawal exceeds overdraft limit. Current balance: $" + String.format("%.2f", getBalance()) + ", Overdraft Limit: $" + String.format("%.2f", overdraftLimit));
     }
 }

 @Override
 public void calculateInterest() {
     System.out.println("No interest calculated for Current Account.");
 }
}

//Interface Loanable
interface Loanable {
 boolean applyForLoan(double loanAmount);
 double calculateLoanEligibility();
}

//Example of an account that can apply for a loan
class LoanableSavingsAccount extends SavingsAccount implements Loanable {
 private double creditScore;

 public LoanableSavingsAccount(String accountNumber, String holderName, double balance, double interestRate, double creditScore) {
     super(accountNumber, holderName, balance, interestRate);
     this.creditScore = creditScore;
 }

 @Override
 public boolean applyForLoan(double loanAmount) {
     if (loanAmount <= calculateLoanEligibility()) {
         System.out.println("Loan of $" + String.format("%.2f", loanAmount) + " approved for account " + getAccountNumber());
         return true;
     } else {
         System.out.println("Loan of $" + String.format("%.2f", loanAmount) + " denied. Exceeds eligibility for account " + getAccountNumber());
         return false;
     }
 }

 @Override
 public double calculateLoanEligibility() {
     return getBalance() * (creditScore / 1000.0) * 2; // Simple eligibility
 }
}

public class BankingSystem {
 public static void main(String[] args) {
     BankAccount savings = new LoanableSavingsAccount("SA001", "John Doe", 10000.0, 0.015, 750);
     BankAccount current = new CurrentAccount("CA002", "Jane Smith", 5000.0, 2000.0);

     System.out.println("--- Banking System ---");
     savings.displayAccountDetails();
     savings.deposit(500);
     savings.withdraw(200);
     savings.calculateInterest();
     System.out.println();

     current.displayAccountDetails();
     current.deposit(1000);
     current.withdraw(7000); // Exceeds balance but within overdraft
     current.withdraw(8000); // Exceeds overdraft
     current.calculateInterest();

     System.out.println("\n--- Processing Account Types (Polymorphism) ---");
     BankAccount[] accounts = {savings, current};
     for (BankAccount acc : accounts) {
         System.out.println("\nProcessing Account: " + acc.getAccountNumber());
         acc.displayAccountDetails();
         acc.calculateInterest();
         if (acc instanceof Loanable) {
             ((Loanable) acc).applyForLoan(15000);
             ((Loanable) acc).applyForLoan(1000);
         }
     }
 }
}
