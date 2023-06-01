package Simplilearn;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of map is:- "+ map.size());

        if(map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println("Value for key \"a\" is:- " +a);
        }

//        for(String key: map.keySet()){
//            System.out.println("key: "+ key+ " value: " + map.get(key));
//        }

        for(Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println("key" + entry.getKey()+ ", value: "+ entry.getValue());
        }
    }
}
