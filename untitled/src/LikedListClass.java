import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LikedListClass {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(3);
        list.remove(Integer.valueOf(20));
        List<Integer> nlist = new ArrayList<>();
        nlist.add(150);
        nlist.add(160);
        list.addAll(nlist);
        int i = list.get(1);
        System.out.println(i);
        //list.clear();
        list.set(2,1000);
        System.out.println(list.contains(50));
        System.out.println(list);
        for(i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(Integer ele: list){
            System.out.println(ele);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
