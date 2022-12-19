import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        //in this file will try to do some practice on Map

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=23; i<345; i+=8){
            map.put(i, i+1);
            System.out.println("key: "+i+"  value: "+i+1);
        }

        System.out.println(map);
    }
}
