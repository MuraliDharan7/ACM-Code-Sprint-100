import java.util.Scanner;

public class primeNum {
    public static boolean checkPrime(int n){
        if(n <= 1) return false;

        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(checkPrime(n));

        sc.close();
    } 
}
