public class CustomaerMain {
    public static void main(String[] args) {
        Address homeAddress = new Address("line 1", "Birnin Kebbi", "4234");
        Customer customer = new Customer("Bashar", homeAddress);
        System.out.println(customer);
        Address workAddress = new Address("line 2", "Yauri", "4234");
       
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
