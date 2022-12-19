package Practice;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "niti";
        String rev = "";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        rev = rev + sb.toString();
        if(str.equals(rev)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
