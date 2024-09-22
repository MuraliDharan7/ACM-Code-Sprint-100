import java.util.Scanner;

public class reverseNumber {
    public static int reverse(int n){
        int reverseSum =0;

        while(n > 0){
        int digit = n % 10;
        reverseSum = reverseSum * 10 + digit;
        n /= 10;
        }
        return reverseSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(reverse(n));

        sc.close();
    }
}
