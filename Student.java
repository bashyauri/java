public class Student extends User implements Talk {
    public boolean verified = true;
    public String major;

    @Override
    public void sayHello() {
        System.out.println("Implements Student");
    }
   
    
}
