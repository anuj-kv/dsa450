package Practice;

public class RotationOfString {
    public static void main(String[] args) {
        String str = "paint";
        String doublee = str + str;
        System.out.println(doublee);
        String target = "intpa";

       Boolean res = doublee.contains(target);
        System.out.println(res);
    }
}
