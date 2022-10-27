package OOP.composition.challenge;

public class Tv {
    private String name;
    private double size;
    public Tv(String name, double size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    
    public double getSize() {
        return size;
    }

    public void onTv() {
        System.out.println("Tv is on");
    }
    
    
}
