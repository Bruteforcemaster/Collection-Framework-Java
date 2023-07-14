import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Min element : "+ Collections.min(list));
        System.out.println("Min element : "+ Collections.max(list));
        System.out.println(Collections.frequency(list,20));
        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());

        List<Student> sset = new ArrayList<>();
        sset.add(new Student("Akash",1));
        sset.add(new Student("Bikash",2));
        sset.add(new Student("Bivash",3));
        sset.add(new Student("Ram",4));
        Student s1 = new Student("Shyam",55);
        Student s2 = new Student("Jodu",25);
        Collections.sort(sset, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(sset);
        System.out.println(s1.compareTo(s2));
    }
}
