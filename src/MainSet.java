import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(1);
        Set<Integer> set=new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(4);
        set.add(2);
        for(Integer k:set){
            System.out.println(k);
        }
    }
}
