import java.util.Scanner;

public class fibonacci {
    public static int nthFibonacci(int n){
        if(n <= 1) return n;

        int a = 0, b = 1, fib = 0;
        for(int i = 2; i <= n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
    static int nthFibonacciRec(int n){
        if(n <= 1) return n;
        return nthFibonacciRec(n-1) + nthFibonacciRec(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(n+"th Fibonacci Number is: " + nthFibonacci(n));;
        System.out.println(n +"th Fibonacci Using Recursion: "+ nthFibonacciRec(n));
        sc.close();
    }
}
