package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println(nthFibonacciNumber(5));
    }
    public static int nthFibonacciNumber(int n){
        if(n<2){
         return n;
        }

        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
}
