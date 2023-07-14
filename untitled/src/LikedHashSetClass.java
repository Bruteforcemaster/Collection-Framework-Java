import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LikedHashSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(111);
        set.add(112);
        set.add(113);
        set.add(114);
        set.add(115);
        set.add(116);
        set.add(117);
        set.add(116);
        set.remove(116);
        System.out.println(set);
        System.out.println(set.contains(111));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
