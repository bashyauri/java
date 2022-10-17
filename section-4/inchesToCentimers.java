public class inchesToCentimers{
    public static double calcFeetAndInchesToCentimers(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12) ) {
           // inches = feet * 12;
           double feetToinches = feet * 12;
           double feetToCentimeters = calcFeetAndInchesToCentimers(feetToinches);
           double inchesTocentimeters = calcFeetAndInchesToCentimers(inches);
           double centimeter = feetToCentimeters + inchesTocentimeters;
           return centimeter;
        }
        return -1;

    }

    public static double calcFeetAndInchesToCentimers(double inches) {
        if (inches >= 0) {
            
             return inches * 2.54;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimers(-10);
        if (centimeters < 0) {
            System.out.println("Invalid Parameters");
        }
        else {
            
        System.out.println(centimeters +" cm");
        }
   
    }
}