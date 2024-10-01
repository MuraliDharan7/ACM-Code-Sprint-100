import java.util.Scanner;

public class CheckVowelConsonant {
    public static void checkVowelConsonant(char ch){
        String vowels = "aeiouAEIOU";

        if(vowels.indexOf(ch) != -1){
            System.out.println(ch+ " is an vowel");
        }
        else{
            System.out.println(ch+ " is an consonant");
        }
    }
    public static void checkVowelConsonant2(char ch){
        if(ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z'){
            ch = Character.toLowerCase(ch);

            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch+ " is an vowel");
            }
            else{
                System.out.println(ch + " is an consonant");
            }
        }
        else{
            System.out.println(ch+ " is not an character");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        checkVowelConsonant2(ch);
        sc.close();
    }
}
 