import java.util.*;

public class freqOfEl {
    public static int countFreq(int[] arr, int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the array element "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element that want the frequency: ");
        int x = sc.nextInt();

        System.out.print(countFreq(arr, x));
    }
}
