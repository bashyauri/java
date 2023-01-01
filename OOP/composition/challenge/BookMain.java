package OOP.composition.challenge;

public class BookMain {
    public static void main(String[] args) {
        MyBook book = new MyBook(123,"OOP Java","Bashar");
        book.addReview(new Review(10,"Great Book",5));
        System.out.println(book);
        List<Student> students = List.of(new Student(1,"Bashar"),new Student(2,"Fatima"),new Student(3,"Lukman"));
    }
    
}
