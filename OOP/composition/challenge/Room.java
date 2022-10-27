package OOP.composition.challenge;

public class Room {
    private Fan fan;
    private Cushion cushion;
    private Tv tv;
    private String name;
    public Room(Fan fan, Cushion cushion, Tv tv,String name) {
        this.fan = fan;
        this.cushion = cushion;
        this.tv = tv;
        this.name = name;

    }

    public void setRoom() {
        tv.onTv();
        fan.onFan();
        cushion.sit();

    }

 

    public void createRoom() {
        System.out.println("Room created");
    }
    
    
}
