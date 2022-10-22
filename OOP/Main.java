package OOP;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getCustomerName());
       System.out.println(bobsAccount.getAccountNumber());
       System.out.println(bobsAccount.getBalance());
       bobsAccount.withdraw(100.0);
       bobsAccount.deposit(50.0);
       bobsAccount.withdraw(100.0);
       bobsAccount.deposit(51.0);
       bobsAccount.withdraw(100.0);
    }
}
