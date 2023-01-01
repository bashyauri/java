public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;
    // creating
    public Customer(String name, Address homeAdress) {
        this.name = name;
        this.homeAddress = homeAdress;
    }
    //operations
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getWorkAdress() {
        return workAddress;
    }

    public String toString() {
        return String.format("Name: %s Home Address: %s Work Address: %s",name,homeAddress,workAddress);
    }
}

