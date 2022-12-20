package Recursion;

public class Factorial {
    public static void main(String[] args) {
        //Find the factorial of a number using the recursion

        int res = factorialOfNumber(5);
        System.out.println(res);

    }
    public static int factorialOfNumber(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return n*factorialOfNumber(n-1);
    }
}
