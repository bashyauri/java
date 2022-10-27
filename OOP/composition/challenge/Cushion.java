package OOP.composition.challenge;



public class Cushion {
    private String cushionType;
    private int cushionCount;
    public Cushion(String cushionType, int cushionCount) {
        this.cushionType = cushionType;
        this.cushionCount = cushionCount;
    }
    public String getCushionType() {
        return cushionType;
    }
   
    public int getCushionCount() {
        return cushionCount;
    }
   
    public void sit(){
        System.out.println("I am sitting on "+cushionType);
    }
  
    
}
