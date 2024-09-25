import java.util.Scanner;

public class sumofArray {
    public static int sumOfElements(int[] arr, int n){
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfElements(arr, n));
        sc.close();
    }
}
