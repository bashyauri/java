import java.util.List;
public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = 
                List.of(new Student(1, "Bashar"), new Student(2, "Fatima"), new Student(3, "Kabiru"));
        System.out.println(students);
        ArrayList<Student> studentsAl = new ArrayList<>(students);
        Collections.sort(studentsAl);
    }
}
