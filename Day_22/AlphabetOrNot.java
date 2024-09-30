import java.util.Scanner;

public class AlphabetOrNot{
    public static boolean alphabetCheck(char ch){
        if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }
    public static boolean alphabetCheck2(char ch){
        if(Character.isLetter(ch)) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        System.out.println(alphabetCheck(ch));
        sc.close();
    }
}