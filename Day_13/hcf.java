import java.util.Scanner;

public class hcf {
    public static int hcfOfTwo(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }  
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print(hcfOfTwo(n1, n2));
        sc.close();
    }   
}
