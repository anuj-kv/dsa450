package Practice;

import jdk.swing.interop.SwingInterOpUtils;

public class S0 {
    public static void main(String[] args) {
        //Reverse a String
        String str = "mynameiskhan";
        /*//Method 1
        String rev = "";
        char[] ch = str.toCharArray();
        for (int i=ch.length-1; i>=0; i--){
            rev = rev+ch[i];
        }
        System.out.println(str);
        System.out.println(rev);*/
        //Method 2

    /*    //Method 3
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);*/

        String str1 = "my name is khan";
        String s[] = str1.split(" ");
        String rev = "";
        for(int i=0; i<s.length; i++){
            StringBuilder ss = new StringBuilder(s[i]);
            ss.reverse();
            rev =rev + ss.toString()+" ";
        }
        System.out.println();
        System.out.println(rev);



    }
}
