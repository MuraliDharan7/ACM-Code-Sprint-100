import java.util.*;

public class sortArray {
    public static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
    public static int[] sorting(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static void insertionSort(int[] arr, int n){
        for(int i=0; i<=n-2; i++){
            int mini = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public static void bubbleSort(int[] arr, int n){
        for(int i=n-1; i>=0; i--){
            int swapDone = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapDone = 1;
                }
            }
            if(swapDone == 0){
                break;
            }
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
        insertionSort(arr,n);
        printArray(arr);
        sc.close();
    }
}
