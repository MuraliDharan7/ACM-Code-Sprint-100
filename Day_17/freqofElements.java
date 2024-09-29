import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqofElements {
    public static void findFrequency(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }
        System.out.println("Frequency of elements:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " | Frequency: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findFrequency(arr);

        sc.close();
    }
}
