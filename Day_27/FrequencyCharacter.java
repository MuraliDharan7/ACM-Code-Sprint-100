import java.util.Scanner;
import java.util.HashMap;

public class FrequencyCharacter {
    public static void characterFrequency(String str){
        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        for(HashMap.Entry<Character, Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        characterFrequency(str);
        sc.close();
    }
}
