import java.util.*;

public class HashMapHashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 180);

        // if(map.containsKey("US")){
        //     System.out.println("Key exists");
        // }else{
        //     System.out.println("Key does'nt exist");
        // }

        System.out.println(map);

        map.remove("China");

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e.hashCode());
        }
    }
}
