public class Fan {
    //state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;// 0 to 5

    // Creation
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    // isOn
    public void switchOn() {
        this.switchOn = true;
        setSpeed((byte)5);
    }

    public void switchOff() {
        this.switchOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
        
    }

    // Print the state
    public String toString() {
      return  String.format("Make - %s, radius - %f , Color - %s, isOn - %b, speed - %d,",make,radius,color,isOn,speed);

    }
    
}
