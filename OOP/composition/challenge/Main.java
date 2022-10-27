package OOP.composition.challenge;
public class Main {
    public static void main(String[] args) {
           /*
           Create a single room of a house using composition.
           Think about the things that should be included in the room.
           Maybe physical parts of the house but furniture as well
           Add at least one method to access an object via a getter and
           then that objects public method as you saw in the previous video
           then add at least one method to hide the object e.g. not using a getter
           but to access the object used in composition within the main class
           like you saw in this video.
           */
          Cushion cushion = new Cushion("3 seater",2);
          Fan fan = new Fan("Ceiling Fan");
          Tv tv = new Tv("Plasma Tv",25.5);
          Room room = new Room(fan, cushion, tv, "Dakin Amarya");
          room.setRoom();
          
            
    }
    
}
