import java.util.Scanner;

public class harshadNum {
    static int sumOfDigits(int num){
        int sum =0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
    public static boolean harshadNumCheck(int n){
        int sum = sumOfDigits(n);
        if(n % sum== 0) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(harshadNumCheck(n)) System.out.println(n + " is a Harshad Number");
        else System.out.println(n + " is not a harshad number");

        sc.close();
    }
}
