/**
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    Map<Integer,Integer> count(int[] numbers){
       Map<Integer,Integer> map=new HashMap<>();
        for(int i:numbers){
           int c=map.getOrDefault(i,0);
           map.put(i,c+1);
       }
       return map;
    }
    public static void main(String[] args) {
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int n=e.getKey();
            int c=getValue();
            if(c==1){
                return n;
            }
    }
}
*/