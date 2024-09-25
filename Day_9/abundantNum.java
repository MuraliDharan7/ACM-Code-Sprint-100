import java.util.Scanner;

public class abundantNum {
    public static boolean abundantCheck(int num){
        int sum = 0;
        for(int i=1; i<=(num/2); i++){ //can be used Math.sqrt(num) also
            if(num % i == 0) sum += i;
        }
        if(sum > num) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(abundantCheck(n));
        sc.close();
    }
}
