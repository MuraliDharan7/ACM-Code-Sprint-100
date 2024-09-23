import java.util.Scanner;

public class perfectNum {
    static boolean perfect(int num){
        int original = num;
        int sum = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return original == sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if(perfect(n)){
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is not a perfect number");
        }
    }
}
