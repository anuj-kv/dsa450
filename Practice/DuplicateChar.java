package Practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] ch = str.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<ch.length; i++){
            if(list.contains(ch[i]) && map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i]) + 1);
            } else if (list.contains(ch[i]) ) {
                map.put(ch[i], 2);
            } else{
                list.add(ch[i]);
            }
        }

        for(Map.Entry<Character,Integer> m:map.entrySet()){
            System.out.println(m);
        }
    }
}
