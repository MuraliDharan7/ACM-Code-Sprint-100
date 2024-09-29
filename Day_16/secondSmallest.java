import java.util.*;

public class secondSmallest {
    public static int secondSmallestEl(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                secondSmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != smallest){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(secondSmallestEl(arr));
        sc.close();
    }
}
