package Collection_FrameWork;

import java.util.*;
import java.util.function.Predicate;

public class MapInterFace {
    public static void main(String[] args) {


        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(39, "jayant");
        hashMap.put(4, "janak");
        hashMap.put(86, "ram");
        hashMap.put(70, "harish");
        hashMap.put(5, "laxman");
        Predicate
//        hashMap.forEach((integer, s) -> System.out.println("keys"+"  "+ integer + "   " + "values" +"  "+ s));


//        hashMap.entrySet().stream().filter(a->a.getKey()%2==0).forEach(System.out::println);

        hashMap.entrySet().stream().filter(a->a.getValue().startsWith("ja") & a.getValue().endsWith("t") || a.getKey()>40).forEach(System.out::println);


//        for (Map.Entry<Integer,String> entry:  hashMap.entrySet()) {
//
//        System.out.println(entry.getKey());
//
//        }

//      Set<Map.Entry<Integer,String>> entrySet= hashMap.entrySet();
//
//        List<Map.Entry<Integer,String>> list=new ArrayList<>(entrySet);
//
//
//        Collections.sort(list,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
//        list.forEach(a-> System.out.println(a.getKey()+"  "+ "" +a.getValue()));
//    }
    }
}
