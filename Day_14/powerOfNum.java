import java.util.Scanner;

public class powerOfNum {
    public static long power(long base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent % 2 == 0) {
            long halfPower = power(base, exponent / 2); //even
            return halfPower * halfPower;
        } 
        else {
            return base * power(base, exponent - 1); //odd
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();

        System.out.println(power(base, exponent));

        sc.close();
    }
}
