import java.util.Scanner;

public class friendlyPairs {
    public static int sumofDivisiors(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0) sum += i;
        }
        return sum;
    }
    public static boolean areFriendlyPairs(int a, int b){
        int sumA = sumofDivisiors(a);
        int sumB = sumofDivisiors(b);

        return (double) sumA/a == (double) sumB/b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();

        if(areFriendlyPairs(n1, n2)){
            System.out.println(n1+","+ n2+" are friendly pairs.");
        }
        else{
            System.out.println(n1+","+ n2+" are not friendly pairs.");
        }
        sc.close();
    }   
}
