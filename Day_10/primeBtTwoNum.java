import java.util.Scanner;

public class primeBtTwoNum {

    public static boolean checkPrime(int n){
        if(n <= 1) return false;

        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++){
            if(checkPrime(i)){
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
