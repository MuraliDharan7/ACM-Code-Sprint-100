import java.util.Scanner;

public class palindrome {
    public static boolean palindromeCheck(int n){
        int original = n;
        int reversedSum = 0;
        
        while(n > 0){
            int digit = n % 10;
            reversedSum = reversedSum * 10 + digit;
            n = n / 10;
        }
        if(original == reversedSum) return true;
        else return false;
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println(palindromeCheck(num));
        sc.close();
    }
}
