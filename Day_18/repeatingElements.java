import java.util.*;

public class repeatingElements {
    public static void findRepeating(int[] arr){
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        boolean traversed = false;
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+" ");
                traversed = true;
            }
        }
        if(!traversed){
            System.out.println("No repeating Elements");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findRepeating(arr);
        sc.close();
    }
}

