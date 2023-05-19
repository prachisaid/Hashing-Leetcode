import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetHashing {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search

        // if(set.contains(1)){
        //     System.out.println("Set contains 1");
        // }

        // if(!set.contains(6)){
        //     System.out.println("Does not contain 6");
        // }

        //Delete

        // set.remove((1));

        // if(!set.contains(set)){
        //     System.out.println("1 was deleted");
        // }

        // System.out.println(set.size());

        // System.out.println(set);

        //Iterator -> traversing the set as theres no index in set we use iterator
        Iterator<Integer> it = set.iterator();
        //hasNext(); next();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
