import java.util.Scanner;
public class leapOrNot {
    public static boolean CheckLeap(int n){
        return (n % 4 == 0 && n % 100 != 0 || n % 400 == 0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(CheckLeap(num));
        sc.close();
    }

}
