import java.util.Scanner;

public class removeSpaces {
    public static String spaceRemoval(String str){
        return str.replace(" ","");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String answer = spaceRemoval(str);
        System.out.println(answer);

        sc.close();
    }
}
