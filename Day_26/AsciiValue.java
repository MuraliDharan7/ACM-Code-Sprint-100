import java.util.Scanner;

public class AsciiValue {
    public static int asciiValue(char ch){
        int value = ch;
        return value;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        System.out.println("ASCII value of"+ch+ " is: "+asciiValue(ch));
        sc.close();
    }
}
