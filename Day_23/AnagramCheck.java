import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        int count = 0;
        for(int i=0; i<str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(ch1 == ch2) count++;
            else{
                break;
            }
        }
        if(count == str1.length()) return true;
        else return false;
    }
    public static boolean areAnagram2(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if(areAnagram2(str1, str2)){
            System.out.println("Both strings are anagram");
        }
        else{
            System.out.println("They are not anagram");
        } 
        
        sc.close();
    }
}
