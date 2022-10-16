import java.util.List;

public  abstract class User implements Talk{
    private String firstName;
    private String lastName;
    public boolean verified = false;

    public User(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

   
   
   
}
