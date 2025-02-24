class Innerexampleofco {
    String AccountholderName;
    int Balance;

    Innerexampleofco(String AccountholderName, int Balance) {
        this.AccountholderName = AccountholderName;
        this.Balance = Balance;
    }

    void displaydisplay() {
        System.out.println("Name : " + AccountholderName + " Balance :" + Balance);
    }

    void deposit(int amount) {
        Balance += amount;
        System.out.println(amount + " Deposited and your Balance is :" + Balance);
    }

    void withdrawal(int enteramount) {
        if (enteramount <= Balance) {
            Balance -= enteramount;
            System.out.println(enteramount + " Your amount has been Withdrawed!");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Name : " + AccountholderName + " Balance :" + Balance);
    }

}

public class exampleofco {
    public static void main(String[] args) {
        Innerexampleofco obj = new Innerexampleofco("Ujval", 5000);
        // obj.displaydisplay();
        obj.deposit(10000);
        obj.withdrawal(4000);
        obj.showBalance();
    }
}
