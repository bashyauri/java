package OOP.composition.challenge;


public class Fan {
   private String modelType;

public String getModelType() {
    return modelType;
}



public Fan(String modelType) {
    this.modelType = modelType;
} 
public void onFan( ) {
    System.out.println("Fan is on!");

}
}
