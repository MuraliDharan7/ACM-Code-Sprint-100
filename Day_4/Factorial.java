import java.util.Scanner;

public class Factorial {

    public static int facUsingLoop(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result*=i;
        }
        return result;
    }
    public static int facUsingRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*facUsingRec(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int num1 = facUsingLoop(n);
        System.out.println("Using Loops: "+num1);

        int num2 = facUsingRec(n);
        System.out.println("Using Recursion: "+num2);

        sc.close();
    }
}
