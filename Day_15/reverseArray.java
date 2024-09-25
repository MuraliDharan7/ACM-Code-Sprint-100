import java.util.Scanner;

public class reverseArray {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static int[] reverseUsingArray(int[] arr){
        int[] reversed = new int[arr.length];

        for(int i =0; i< arr.length; i++){
            reversed[i] = arr[arr.length-1-i];
        }
        return reversed;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] reversedArray = reverseUsingArray(arr);
        System.out.println("Reversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        /*reverse(arr);

        System.out.println("Reversed array: ");
        for (int num : arr) { 
            System.out.println(num);
        } */
        sc.close();
    }
}
