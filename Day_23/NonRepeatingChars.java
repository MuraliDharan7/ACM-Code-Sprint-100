import java.util.*;

public class NonRepeatingChars {
    public static void nonRepeatingString(String str){
        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        boolean found = false;
        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
                found = true;
            }
        }
        if(!found) System.out.println("No Non-repeating Characters");
    }
    public static void nonRepeatingString2(String str){
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(freqMap.get(ch)==1){
                System.out.print(ch+ " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        nonRepeatingString2(str);
        sc.close();
    }
}
