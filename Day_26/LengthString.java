import java.util.Scanner;

public class LengthString {
    public static int lengthString(String str){
        char[] charArray = str.toCharArray();

        int count = 0;
        for(char c: charArray){
            count++;
        }
        return count;
    }
    static int lengthString2(String str){
        int count =0;
        try{
            while(true){
                char ch = str.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){

        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("length of string is: "+lengthString2(str));
        sc.close();
    }
}
