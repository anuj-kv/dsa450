package Recursion;

public class Print {
    public static void main(String[] args) {
        //Print Hello World 5 times
        print(5);
        System.out.println();
        printNumber(1);
    }
    static void print(int n){
        if(n<=0){
            return;
        }
        System.out.println("Hello World");
        print(n-1);
    }
    static void printNumber(int num){
      if(num>5) return;
        System.out.println(num);
        printNumber(num+1);
    }

}

