import java.util.Scanner;

public class primeFactors{

    public static void findPrimeFactors(int n){
        while(n % 2 == 0){
            System.out.print(2 + " ");
            n /= 2;
        }

        for(int i = 3; i * i <= n; i+=2){
            while(n % i == 0){
                System.out.print(i+ " ");
                n /= i;
            }
        }
        if(n > 2) System.out.print(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        findPrimeFactors(n);
        sc.close();
    }
}