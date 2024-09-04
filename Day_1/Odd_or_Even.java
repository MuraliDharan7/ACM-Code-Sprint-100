import java.util.Scanner;

public class Odd_or_Even{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if(num==0){
            System.out.println("Number is Zero");
        }
        else if(num%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is ODD");
        }
        sc.close();
    }
}