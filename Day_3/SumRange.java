import java.util.Scanner;

public class SumRange {
    public static int sumRangeUsingLoop(int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum += i;
        }
        return sum;
    }
    public static int sumRangeUsingFormula(int start, int end){
        int no_of_terms = end - start + 1;
        return (no_of_terms * (start+end))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Start : ");
        int start = sc.nextInt();

        System.out.println("End :");
        int end = sc.nextInt();

        int sum1 = sumRangeUsingLoop(start, end);
        System.out.println("Range sum using Loop: "+ sum1);

        int sum2 = sumRangeUsingFormula(start, end);
        System.out.println("Range sum using Formula: "+sum2);

        sc.close();

    }
}
