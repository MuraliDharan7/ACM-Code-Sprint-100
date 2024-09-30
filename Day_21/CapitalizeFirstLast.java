import java.util.Scanner;

public class CapitalizeFirstLast {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for(String word: words){
            System.out.print(word.substring(0,1).toUpperCase() + word.substring(1, word.length()-1)+word.substring(word.length()-1).toUpperCase()+" ");
        }

        sc.close();
    }
}
