import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Student> sset = new HashSet<>();
        sset.add(new Student("Akash",1));
        sset.add(new Student("Bikash",2));
        sset.add(new Student("Bivash",3));
        sset.add(new Student("Ram",4));

        sset.add(new Student("Rohit",2));

        System.out.println(sset);
    }
}
