package OOP;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getCustomerName());
       System.out.println(bobsAccount.getAccountNumber());
       System.out.println(bobsAccount.getBalance());
      ;
       bobsAccount.withdraw(500.0);
       bobsAccount.deposit(50.0);
       bobsAccount.withdraw(100.0);
       bobsAccount.deposit(51.0);
       bobsAccount.withdraw(100.0);

       /*
        Create a new class VipCustomer
        It should have 3 fields name, credit limit, and email address.
        create 3 constructors
        1st constructor empty should call the constructor with 3 parameters with default values
        2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        3rd constructor should save all fields.
        create getters only for this using code generation of IntelliJ as setters wont be needed
        test and confirm it works.
        */
        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Bob", 100.0);
        VipCustomer vipCustomer3 = new VipCustomer("Bob", 100.0, "myemail@bob.com");
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());
        System.out.println();
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());
        System.out.println();
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmailAddress());
    }
}
