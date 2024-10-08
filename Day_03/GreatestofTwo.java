import java.util.Scanner;

public class GreatestofTwo {

    public static int greatestUsingCondition(int a, int b){
        if(a > b){
            return a;
        }
        else if(a < b){
            return b;
        }
        return 0;
    }
    public static int greatestUsingFunction(int a, int b){
        return Math.max(a, b);
    }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int a = sc.nextInt();

        System.out.println("Second number: ");
        int b = sc.nextInt();

        int num1 = greatestUsingCondition(a, b);
        System.out.println("Greatest using Condition: "+num1);

        int num2 = greatestUsingFunction(a, b);
        System.out.println("Greatest using Function:"+num2);

        sc.close();
    }
}
