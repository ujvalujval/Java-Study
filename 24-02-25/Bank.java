abstract class BankAccount {
    private String accountNumber;
    private int balance;
    static int interestRate = 5;

    BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void calculateInterest();

    public void display() {
        System.out.println("This is your Account Number: " + accountNumber);
        System.out.println("Your Balance Amount: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private int time; 
    SavingsAccount(String accountNumber, int balance, int time) {
        super(accountNumber, balance); 
        this.time = time;
    }

    @Override
    void calculateInterest() {
        double interest = (getBalance() * interestRate * time) / 100;
        System.out.println("Your Interest is: " + interest);
        
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount person1 = new SavingsAccount("7432117", 1000, 2);
        person1.display();
        person1.calculateInterest();
        System.out.println();
        SavingsAccount person2 = new SavingsAccount("8248772", 5000, 4);
        person2.display();
        person2.calculateInterest();
    }
}


