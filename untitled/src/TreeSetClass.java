import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(111);
        set.add(122);
        set.add(113);
        set.add(134);
        set.add(115);
        set.add(146);
        set.add(117);
        set.add(156);
        set.remove(116);
        System.out.println(set);
        System.out.println(set.contains(111));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
