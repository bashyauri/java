package OOP.polymorphism.Challenge;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("unknown Engine started");
    }

    public void accelerate() {
        System.out.println("Unknown car is accelerating");
    }

    public void brake() {
        System.out.println("Unknown car stops");
    }

}

class Mercedes extends Car {
    Mercedes(int cylinders, String name) {
        super(cylinders, name);

    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes starting engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes car stops");
    }

}

class Toyota extends Car {
    Toyota(int cylinders, String name) {
        super(cylinders, name);

    }

    @Override
    public void startEngine() {
        System.out.println("Toyota starting engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Toyota car stops");
    }

}
class Honda extends Car {
    Honda(int cylinders, String name) {
        super(cylinders, name);

    }
    @Override
    public void startEngine() {
        System.out.println("Honda starting engine");
    }
    @Override
    public void accelerate() {
        System.out.println("Honda is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Honda car stops");
    }

    public static void main(String[] args) {
       
        Mercedes mercedes = new Mercedes(32,"Mercedes");
        Toyota toyota = new Toyota(16, "Corrolla");
        Honda honda = new Honda(8, "Joker");

        System.out.println(mercedes.getName());
        System.out.println(mercedes.getCylinders());
        mercedes.accelerate();
        mercedes.brake();
        System.out.println();
        System.out.println(toyota.getName());
        System.out.println(toyota.getCylinders());
        toyota.accelerate();
        toyota.brake();

        System.out.println();
        System.out.println(honda.getName());
        System.out.println(honda.getCylinders());
        honda.accelerate();
        honda.brake();
    }
  
}
