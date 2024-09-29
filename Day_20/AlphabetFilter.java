import java.util.*;

public class AlphabetFilter {
    public static String removeNonAlphabets(String str){
        return str.replaceAll("[^a-zA-Z]", "");
    }
    public static String removeNonAlphabets2(String str){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String answer = removeNonAlphabets2(str);
        System.out.println(answer);

        sc.close();
    }
}
