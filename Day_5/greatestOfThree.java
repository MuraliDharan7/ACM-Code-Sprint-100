import java.util.Scanner;

public class greatestOfThree {
    public static int greatestOfThreeNum(int num[]){
        int greatest = 0;
        for(int i=0; i<3; i++){
            if(num[i] > greatest){
                greatest = num[i];
            }
        }
        return greatest;
    }
    public static int secondType(int num[]){
        int a = num[0];
        int b = num[1];
        int c = num[2];

        if(a > b && a > c) return a;
        else if(b > a && b > c) return b;
        else return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        for(int i=0; i<3; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.println(secondType(num));
    }
}
