import java.util.Scanner;

public class strongNum {
    public static int factorial(int n){
        int sum = 1;
        for(int i=1; i<=n; i++){
            sum = sum * i;
        }
        return sum;
    }

    public static boolean strong(int num){
        int original = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum = sum + factorial(digit);
            num /= 10;
        }
        return original==sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n =  sc.nextInt();

        if(strong(n)) System.out.println(n+" is a Strong Number.");
        else System.out.println(n + " is not a Strong Number.");
        sc.close();
    }
}
