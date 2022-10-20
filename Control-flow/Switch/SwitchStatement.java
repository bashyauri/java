
public class SwitchStatement {
    public static void main(String[] args) {
        char character = 'A';
        switch (character) {
            case 'A':
            System.out.println("The character A was found");
            break;
            case 'B':
            System.out.println("The character B was found");
            break;
            case 'C':
            System.out.println("The character C was found");
            break;
            case 'D':
            System.out.println("The character D was not found");
            break;
            case 'E':
            System.out.println("The character E was not found");
            default:
            System.out.println("Not found");


        }
    }
    
}
