import java.util.Scanner;

public class SumofnNaturalNumber {

    public static int SumNatural(int[] number){
        int sum =0;
        for(int numbers: number){
            sum += numbers;
        }
        return sum;
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter no. of Natural numbers: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the Numbers: ");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        } 

        int sum = SumNatural(numbers);
        System.out.println("Sum of N Natural numbers: "+sum);

        sc.close();
    }
}
