import java.util.*;

public class removeVowels {
    static void vowelsRemoval(String str){
        String vowels = "aeiouAEIOU";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(vowels.indexOf(ch) == -1){
                System.out.print(ch+" ");
            }
        }
    }

    public static String vowelRemoval2(String str){
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(vowels.indexOf(ch) == -1){
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String vowelRemoval3(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String answer = vowelRemoval3(str);
        System.out.println(answer);

        sc.close();
    }
}
