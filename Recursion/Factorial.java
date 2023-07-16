package Recursion;

public class Factorial {
    public static void main(String s[]) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println("Done");
    }

    public static int factorial(int n) {
        if(n<2)
            return 1;
        return n*factorial(n-1);
    }
    
}
