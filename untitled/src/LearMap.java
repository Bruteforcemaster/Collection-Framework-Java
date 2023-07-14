import java.util.HashMap;
import java.util.Map;

public class LearMap {
    public static void main(String[] args) {
        Map<String,Integer> num = new HashMap<>();

        num.put("one",1);
        num.put("two",2);
        num.put("three",3);
        num.put("four",4);
        num.put("five",5);

        System.out.println(num);
        num.put("two",23);//override the previous value

        //to escape this do :-->
        if(!num.containsKey("two")){
            num.put("four",44);
        }

        num.putIfAbsent("five",6);//same as above if
        System.out.println(num);

        for(Map.Entry<String,Integer> e: num.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(num.containsValue(3));
        System.out.println(num.isEmpty());
    }
}
