package FirstStepSelfStudy;

public class BankAccountDemo {


  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("1","ShawnYue");
    test(bankAccount);
    System.out.println(bankAccount.getAccountName());
    System.out.println(bankAccount.getAccountNumber());
    System.out.println(bankAccount.getBalance());
  }

  public static void test(BankAccount bankAccount){
    bankAccount.deposit(6000);
    bankAccount.withdraw(3000);
  }

}

class BankAccount{
  private String accountNumber;
  private String accountName;
  private double balance;
  private static double interestRate; //利率因为静态变量 被共享

  public BankAccount(String accountNumber,String accountName){
    this.accountName = accountName;
    this.accountNumber = accountNumber;
    balance = 0;
  }

  public String getAccountName() {
    return accountName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amountIn){
    balance = balance + amountIn;
  }

  public void withdraw(double amountIn){
    balance = balance - amountIn;
  }

  public static void setInterestRate(double interestRate) {
    BankAccount.interestRate = interestRate;
  }

  public static double getInterestRate() {
    return interestRate;
  }
}
