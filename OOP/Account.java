package OOP;

public class Account {
    private String accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double balance;

    public Account() {
        this("12345", "Zaidu", "default address", "Null", 500);
        System.out.println("Empty cunstructor call");
    }

    public Account(String accountNumber, String customerName, String email, String phoneNumber, double balance) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public void getAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double funds) {
        balance += funds;
        System.out.println("Your account has been credited with N"  + funds +" and your balance is " + getBalance());
    }

    public void withdraw(double funds) {
        if (funds <= balance) {
            balance -= funds;
            System.out.println("Your account has been debited with N" + funds +" and your balance is " + getBalance());
        }
        else {
            System.out.println("Insufficient funds to withdraw");
        }
    }
    
}
