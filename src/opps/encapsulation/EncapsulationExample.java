package opps.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(5000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}

