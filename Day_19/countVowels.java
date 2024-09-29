import java.util.*;

public class countVowels {
    public static int vowelsCounter(String str){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println(vowelsCounter(str));
        sc.close();
    }
}
