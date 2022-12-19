import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        //In this class we will practice various method of the ArrayList
        /*
        Arraylist class implement List interface which implement collection Interface
        Arraylist is a dynamic array which expands and shrink it size influenced by the operation performed on it
        .add()
        .get()
        .remove()
        .clear()
        .addAll()
        above mention are some very common methods used with the arraylist
         */

        //Lets create an arraylist

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(44);

        System.out.println(list);

        list.add(1,3333);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2222222);
        list1.add(4342);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        list.remove(Integer.valueOf(4342));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("List 1 ");
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);

    }
}
