import java.util.*;

public class nonRepeatingEl {
    public static void findNonRepeating(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        boolean found = false;
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if(entry.getValue() ==1){
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if(!found) System.out.println("No Non-Repeating Elements");
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findNonRepeating(arr);
        sc.close();
    }
}
