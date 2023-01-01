public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
        fan.switchOn();
       fan.setSpeed((byte)5);
        System.out.println(fan);
        
    }
}
