import java.util.Scanner;

public class ReplaceSubstring {
    public static String replaceSubstring(String str, String oldWord, String newWord){
        return str.replaceAll(oldWord, newWord);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the full string: ");
        String str = sc.nextLine();

        System.out.print("Enter the oldword: ");
        String oldW = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newW = sc.nextLine();

        System.out.println(replaceSubstring(str, oldW, newW));

        sc.close();
    }
}
