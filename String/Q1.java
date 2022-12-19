package String;

public class Q1 {
    public static void main(String[] args) {
        //CHeck Whether a String is Palindrome or not
        String str = "nitn";

        char[] ch = str.toCharArray();
         String rev = "";
         for(int i=ch.length-1; i>=0; i--){
             rev += ch[i];
         }
        System.out.println(rev);

         if(str.equals(rev)){
             System.out.println(" YEs the given string is palindrome");
         }else{
             System.out.println(" No the given string is not palindrome");
         }


    }
}
