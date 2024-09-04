import java.util.Scanner;

public class SumofNatura {

    public static int sumUsingFormula(int n){
        return n*(n+1)/2;
    }

    public static int sumUsingLoops(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sumUsingFormula1 = sumUsingFormula(n);
        int sumUsingLoops1 = sumUsingLoops(n);
        System.out.println("Sum Using formula: "+ sumUsingFormula1);
        System.out.println("Sum using loops: "+sumUsingLoops1);

        sc.close();
    }
}
