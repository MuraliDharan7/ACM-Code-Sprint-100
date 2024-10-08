import java.util.Scanner;

public class automorphic {
    static int squareNum(int n){
        return n * n;
    }
    public static boolean checkAutomorphic(int n){
        int digit1 = n % 10;
        int digit2 = squareNum(n) % 10;

        if(digit1 == digit2) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if(checkAutomorphic(n)) System.out.println(n + " is a Automorphic Number");
        else System.out.println(n + " is not Automorphic Number");

        sc.close();
    }
}
