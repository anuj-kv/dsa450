package String;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        //Find Duplicate Characters in a string

        String str = "nitin";
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
        for(int i=ch.length-1; i>=0; i--){
            hp.put(ch[i],1);
        }
    }
}
