import java.util.ArrayList;
public class MyBook {
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();


    
    public MyBook(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    
    public void addReview(Review review) {
        this.reviews.add(review);

    }

    public String toString() {
        return String.format("id: %d Name: %s Author: %s Review %s", id, name, author,reviews);
    }

   
    
    
}
