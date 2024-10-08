import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}