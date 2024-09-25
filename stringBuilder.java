import java.util.*;

public class stringBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to Reverse: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String reversedString = sb.toString();

        System.out.print("Reversed String: "+reversedString);
        sc.close();
    }
}
