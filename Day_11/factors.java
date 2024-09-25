import java.util.Scanner;

public class factors {
    public static void findFactors(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i+ ",");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.print(n + "th Factors are: ");
        findFactors(n);

        sc.close();
    }
}
