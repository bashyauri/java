package OOP;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car holden = new Car();
        Car porsche = new Car();
        toyota.setModel("Camry");
        porsche.setModel("Porsche");
        System.out.println("Toyota Model is " + toyota.getModel());
        System.out.println("Porsche Model is " + porsche.getModel());
    }
}
