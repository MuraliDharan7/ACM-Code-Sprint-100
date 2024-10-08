import java.util.Scanner;

public class SumofNaturalNumbers{
    public static int SumWithLoop(int n){
        int sum =0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
        
        return sum;
    }

    public static int SumWithFormula(int n){
        return n * (n+1)/2;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int sum1 = SumWithLoop(n);
        System.out.println("Sum with using Loops: "+sum1);

        int sum2 = SumWithFormula(n);
        System.out.println("Sum with using Formula: "+sum2);

        sc.close();
    }
}