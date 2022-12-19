import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        //In this file I will try to do basic operation on the stack
        /*
        Stack is LIFO type of a ds
        .push()
        .pop()
        .peak()
        above mentioned are some common methods
         */
        //Lets just make a stack
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(44);
        for(int i=3; i<100; i+=12){
            stack.push(i);
        }
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.contains(27));
        System.out.println(stack.contains(272));
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.add(27);
        stack1.add(51);
        stack1.add(512);
        System.out.println(stack1);
        System.out.println(stack.containsAll(stack1));
        stack1.addAll(stack1);
        System.out.println(stack);
        stack1.clear();
        System.out.println(stack1);
        stack.remove(2);
        System.out.println(stack);

    }
}
