import java.util.Scanner;

public class perfectSquare {
    public static double squareUsingFunc(int n){
        double sqr = Math.sqrt(n);

        if(sqr == Math.floor(sqr)) return sqr;
        else return 0;
    }
    public static boolean squareWithoutFunc(int n){
        boolean sqr = false;
        for(int i=0; i*i <= n; i++){
            if(i*i == n){
                sqr = true;
                break;
            }
        }
        return sqr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        System.out.println("The perfect square is "+squareUsingFunc(n));
        if(squareWithoutFunc(n)) System.out.println(n+ " is a perfect square");
        else System.out.println(n + " is not a perfect square");

        sc.close();
    }
}
